package com.example.coin_kotlin.utility

import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import com.example.coin_kotlin.R
import com.example.coin_kotlin.data.Candle
import com.github.mikephil.charting.charts.CandleStickChart
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.CandleData
import com.github.mikephil.charting.data.CandleDataSet
import com.github.mikephil.charting.data.CandleEntry

class MPchart(val candleStickChart: CandleStickChart) {

    fun Init_Chart(){
        val priceChart = candleStickChart

        priceChart.description.isEnabled = true
        priceChart.setMaxVisibleValueCount(30)
        priceChart.setPinchZoom(true)
        priceChart.setDrawGridBackground(true)
        priceChart.description.text = "일봉차트"
        priceChart.description.textColor = R.color.classicBlue


        //x축
        val xAxis = priceChart.xAxis
        //세로선 표시여부
        xAxis.setDrawGridLines(true)
        xAxis.axisLineColor = Color.BLACK
        xAxis.gridColor = Color.rgb(50, 59, 76)
        xAxis.isEnabled = true

        //왼쪽 y축
        val Left_Axis = priceChart.axisLeft
        Left_Axis.isEnabled = false

        //오른쪽 y축
        val Right_Axis = priceChart.axisRight
        Right_Axis.setLabelCount(5, false)
        Right_Axis.textColor = Color.BLACK

        //가로선 표시여부
        Right_Axis.setDrawGridLines(true)
        // 차트의 오른쪽 테두리 라인 설정
        Right_Axis.setDrawAxisLine(true)
        Right_Axis.axisLineColor = Color.BLACK
        Right_Axis.gridColor = Color.rgb(50, 59, 79)

        priceChart.isAutoScaleMinMaxEnabled = true
        priceChart.legend.isEnabled = false
    }

    fun Set_priceData(candles:ArrayList<Candle>){
        val priceChart = candleStickChart
        Log.d("Set_priceData", "candles: " + candles.size)

        val candleEntries: MutableList<CandleEntry> =
            java.util.ArrayList()

        for (x in candles.indices) {
            candleEntries.add(
                CandleEntry(
                    x.toFloat(),
                    candles[x].high!!.toFloat(),
                    candles[x].low!!.toFloat(),
                    candles[x].open!!.toFloat(),
                    candles[x].close!!.toFloat()
                )
            )
        }

        val candleDataSet = CandleDataSet(candleEntries, "일봉차트")

        candleDataSet.axisDependency = YAxis.AxisDependency.RIGHT

        //심지
        candleDataSet.shadowColor = Color.LTGRAY
        candleDataSet.shadowWidth = 0.85f
        //음봉
        candleDataSet.decreasingColor = Color.BLUE
        candleDataSet.increasingPaintStyle = Paint.Style.FILL
        //양봉
        candleDataSet.increasingColor = Color.RED
        candleDataSet.increasingPaintStyle = Paint.Style.FILL

        candleDataSet.neutralColor = Color.rgb(6, 18, 34)
        candleDataSet.setDrawValues(true)


        // 터치시 노란 선 제거
        val candleData = CandleData(candleDataSet)
        priceChart.data = candleData
        priceChart.invalidate()

        val LIMIT_NUM = 75

        priceChart.setVisibleXRange(10f, LIMIT_NUM.toFloat()) //한 화면에 보이는 갯수

//        //가장 최근의 데이터로 스크롤해줌.
        priceChart.moveViewToX(priceChart.data.entryCount - (LIMIT_NUM + 1).toFloat())
    }

}