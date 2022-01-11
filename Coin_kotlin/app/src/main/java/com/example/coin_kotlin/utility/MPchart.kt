package com.example.coin_kotlin.utility

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import androidx.annotation.ColorRes
import androidx.annotation.NonNull
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.convertTo
import androidx.core.graphics.toColor
import com.example.coin_kotlin.R
import com.example.coin_kotlin.data.Candle
import com.github.mikephil.charting.charts.CandleStickChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.CandleData
import com.github.mikephil.charting.data.CandleDataSet
import com.github.mikephil.charting.data.CandleEntry
import com.github.mikephil.charting.formatter.IAxisValueFormatter
import com.github.mikephil.charting.formatter.ValueFormatter
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MPchart(val candleStickChart: CandleStickChart) {

    fun Init_Chart(){
        val priceChart = candleStickChart
        val setcolor: (id:Int) -> Int = {
            ContextCompat.getColor(priceChart.context,it)
        }

        priceChart.run {
            setMaxVisibleValueCount(30)
            setPinchZoom(true)

            //차트명
            description.run {
                isEnabled = true
                text = "일봉차트"
                xOffset = 10f
                yOffset = 5f
                textColor = setcolor(R.color.night_white)
            }

            isAutoScaleMinMaxEnabled = true
            legend.isEnabled = false

            //차트 배경 색상
//            setDrawGridBackground(true)
//            setGridBackgroundColor(R.color.night)
//            setBackgroundColor(R.color.night)
        }

        //x축 세로선 표시여부
        priceChart.xAxis.run {
            isEnabled = true
            textColor = setcolor(R.color.night_white)
            position = XAxis.XAxisPosition.BOTTOM
            setDrawGridLines(true)
            val ss = object : ValueFormatter(){
                override fun getCandleLabel(candleEntry: CandleEntry): String {
                    val date = candleEntry.data.toString()
                    Log.e("priceData", "createdat: $date")
                    return date
                }
            }
            valueFormatter = ss
        }

        //오른쪽 y축
        priceChart.axisRight.run {
            isEnabled = true
            textColor = setcolor(R.color.night_white)
            setLabelCount(5, false)
            setDrawGridLines(true) //가로선 표시여부

            // 차트의 오른쪽 테두리 라인 설정
            setDrawAxisLine(true)
//            axisLineColor = setcolor(R.color.night_white)
//            gridColor = setcolor(R.color.gray)
        }

        //왼쪽 y축
        priceChart.axisLeft.run {
            isEnabled = false
        }

    }

    @SuppressLint("SimpleDateFormat")
    fun Set_priceData(candles:ArrayList<Candle>){
        val priceChart = candleStickChart
        Log.d("Set_priceData", "candles: " + candles.size)

        val candleEntries: MutableList<CandleEntry> = ArrayList()

        for (x in candles.indices) {

            val date : () -> String = {
                SimpleDateFormat("yy/MM/dd")
                    .format(Date(candles[x].createdAt!!.toLong()))
            }

//            Log.e("priceData","createdat: "+ date())

            candleEntries.add(
                CandleEntry(
                    x.toFloat(),
                    candles[x].high!!.toFloat(),
                    candles[x].low!!.toFloat(),
                    candles[x].open!!.toFloat(),
                    candles[x].close!!.toFloat(),
                    date()
                )
            )
        }

        val candleDataSet = CandleDataSet(candleEntries, "일봉차트")

        candleDataSet.run {
            axisDependency = YAxis.AxisDependency.RIGHT
            //심지
//            shadowColor = Color.LTGRAY
            //심지가 캔들과 색이 똑같게
            shadowColorSameAsCandle = true
            shadowWidth = 0.85f

            //음봉
            decreasingColor = Color.BLUE
            increasingPaintStyle = Paint.Style.FILL

            //양봉
            increasingColor = Color.RED
            increasingPaintStyle = Paint.Style.FILL

//            neutralColor = Color.rgb(6, 18, 34)
        }

        val candleData = CandleData(candleDataSet)

        priceChart.run {
            data = candleData
            invalidate()

            val LIMIT_NUM = 75
            setVisibleXRange(10f, LIMIT_NUM.toFloat()) //한 화면에 보이는 갯수
            //가장 최근의 데이터로 스크롤해줌.
            moveViewToX(priceChart.data.entryCount.toFloat())

//            setBorderColor(Color.BLACK)
        }
    }

}