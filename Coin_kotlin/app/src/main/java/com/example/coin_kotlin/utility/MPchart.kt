package com.example.coin_kotlin.utility

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.coin_kotlin.R
import com.example.coin_kotlin.data.Candle
import com.github.mikephil.charting.charts.CandleStickChart
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.CandleData
import com.github.mikephil.charting.data.CandleDataSet
import com.github.mikephil.charting.data.CandleEntry
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.utils.Utils
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MPchart(val candleStickChart: CandleStickChart) {

    @SuppressLint("SimpleDateFormat")
    fun Set_priceData(candles:ArrayList<Candle>){
        val priceChart = candleStickChart
        val setcolor: (id:Int) -> Int = {
            ContextCompat.getColor(priceChart.context,it)
        }
        Log.d("Set_priceData", "candles: " + candles.size)

        val candleEntries: MutableList<CandleEntry> = ArrayList()

        val date : (idx:Int) -> String = {
            val res = SimpleDateFormat("yy/MM/dd")
                .format(Date(candles[it].createdAt!!.toLong()))

            val ss = StringBuffer(res).apply {
                if(this[0] == '2' && (this[1] == '2' || this[1] == '1')){
                    this.delete(0,3)
                }
            }

            ss.toString()
        }
        val arr = ArrayList<String>()

        for (x in candles.indices) {

            val entry =  CandleEntry(
                x.toFloat(),
                candles[x].high!!.toFloat(),
                candles[x].low!!.toFloat(),
                candles[x].open!!.toFloat(),
                candles[x].close!!.toFloat()
                ,date(x)
            )

//            arr.add(date(x))
            candleEntries.add(entry)
        }

        val candleDataSet = CandleDataSet(candleEntries, "일봉차트")

        candleDataSet.run {
            axisDependency = YAxis.AxisDependency.RIGHT

            //심지
            shadowColorSameAsCandle = true
            shadowWidth = 0.85f

            //음봉
            decreasingColor = Color.BLUE
            increasingPaintStyle = Paint.Style.FILL

            //양봉
            increasingColor = Color.RED
            increasingPaintStyle = Paint.Style.FILL

//            valueFormatter = object : ValueFormatter(){
//                override fun getAxisLabel(value: Float, axis: AxisBase?): String {
//                    if(value.toInt() <= entryCount)
//                        return candleEntries[value.toInt()].data.toString()
//                    else
//                        return ""
//                }
//            }
        }

        //x축
        priceChart.xAxis.run {
            isEnabled = true
            textColor = setcolor(R.color.night_white)
            position = XAxis.XAxisPosition.BOTTOM
//            setDrawGridLines(true)
//            setLabelCount(5,false)
            textSize = 7f
//
            valueFormatter = object : ValueFormatter(){
                override fun getAxisLabel(value: Float, axis: AxisBase?): String {
                    if(value.toInt() <= candleEntries.size){
                        return candleEntries[value.toInt()].data.toString()
                    }
                    return super.getFormattedValue(value)
                }
            }

        }

        //오른쪽 y축
        priceChart.axisRight.run {
            isEnabled = true
            textColor = setcolor(R.color.night_white)
            setLabelCount(5, false)
            setDrawGridLines(true) //가로선 표시여부

            // 차트의 오른쪽 테두리 라인 설정
            setDrawAxisLine(true)
        }

        //왼쪽 y축
        priceChart.axisLeft.run {
            isEnabled = false
        }

        priceChart.run {
            setMaxVisibleValueCount(6)
            setPinchZoom(true)

//            차트명
            description.run {
                isEnabled = true
                text = "일봉차트"
                xOffset = 10f
                yOffset = 3f
                textColor = setcolor(R.color.night_white)
            }

            isAutoScaleMinMaxEnabled = true
            legend.isEnabled = false

            data = CandleData(candleDataSet)
            data.setDrawValues(true)

            invalidate()

            val LIMIT_NUM = 75
            setVisibleXRange(10f, LIMIT_NUM.toFloat()) //한 화면에 보이는 갯수
            //가장 최근의 데이터로 스크롤해줌.
            moveViewToX(candleEntries.size.toFloat())
        }
    }

}