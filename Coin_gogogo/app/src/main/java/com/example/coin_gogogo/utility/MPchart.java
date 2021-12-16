package com.example.coin_gogogo.utility;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.data.Candle;
import com.github.mikephil.charting.charts.CandleStickChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;

import java.util.ArrayList;
import java.util.List;

public class MPchart {

    private static MPchart instance;
    private CandleStickChart candleStickChart;

    public MPchart(CandleStickChart candleStickChart){
        this.candleStickChart = candleStickChart;
    }

    public void Init_Chart(){
        Log.d("Init_Chart","Init_Chart: ");
        CandleStickChart priceChart = this.candleStickChart;

        priceChart.getDescription().setEnabled(true);
        priceChart.setMaxVisibleValueCount(30);
        priceChart.setPinchZoom(true);
        priceChart.setDrawGridBackground(true);
        priceChart.getDescription().setText("일봉차트");
        priceChart.getDescription().setTextColor(R.color.classicBlue);
//        priceChart.getDescription().setPosition(XAxis.XAxisPosition.BOTTOM,YAxis.YAxisLabelPosition.OUTSIDE_CHART);

        //x축
        XAxis xAxis = priceChart.getXAxis();
//        xAxis.setTextColor(Color.BLACK);
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//        //세로선 표시여부
        xAxis.setDrawGridLines(true);
        xAxis.setAxisLineColor(Color.BLACK);
        xAxis.setGridColor(Color.rgb(50,59,76));
        xAxis.setEnabled(true);

        //왼쪽 y축
        YAxis Left_Axis = priceChart.getAxisLeft();
        Left_Axis.setEnabled(false);

        //오른쪽 y축
        YAxis Right_Axis = priceChart.getAxisRight();
        Right_Axis.setLabelCount(5,false);
        Right_Axis.setTextColor(Color.BLACK);

        //가로선 표시여부
        Right_Axis.setDrawGridLines(true);
        // 차트의 오른쪽 테두리 라인 설정
        Right_Axis.setDrawAxisLine(true);
        Right_Axis.setAxisLineColor(Color.BLACK);
        Right_Axis.setGridColor(Color.rgb(50,59,79));

//        Right_Axis.setSpaceTop(0.5f);
//        Right_Axis.setSpaceBottom(0.5f);

        priceChart.setAutoScaleMinMaxEnabled(true);
        priceChart.getLegend().setEnabled(false);
    }

    public void Set_priceData(ArrayList<Candle> candles) {
        CandleStickChart priceChart = this.candleStickChart;
        Log.d("Set_priceData","candles: "+candles.size());

        List<CandleEntry> candleEntries = new ArrayList<>();

        for (int x = 0; x < candles.size(); x++) {
            candleEntries.add(new CandleEntry(
                    x,
                    Float.parseFloat(candles.get(x).high),
                    Float.parseFloat(candles.get(x).low),
                    Float.parseFloat(candles.get(x).open),
                    Float.parseFloat(candles.get(x).close)
            ));
//            Log.d("candle", "creat: " + candles.get(x).createdAt + "\nhigh: " + candles.get(x).high + "\nlow: " + candles.get(x).low + "\nopen: " + candles.get(x).open + "\nclose: " + candles.get(x).close);
        }

        CandleDataSet candleDataSet = new CandleDataSet(candleEntries, "일봉차트");

        candleDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);

        //심지
        candleDataSet.setShadowColor(Color.LTGRAY);
        candleDataSet.setShadowWidth(0.85f);
        //음봉
        candleDataSet.setDecreasingColor(Color.BLUE);
        candleDataSet.setIncreasingPaintStyle(Paint.Style.FILL);
        //양봉
        candleDataSet.setIncreasingColor(Color.RED);
        candleDataSet.setIncreasingPaintStyle(Paint.Style.FILL);

        candleDataSet.setNeutralColor(Color.rgb(6, 18, 34));
        candleDataSet.setDrawValues(true);

        // 터치시 노란 선 제거
//      candleDataSet.setHighLightColor(Color.TRANSPARENT);

        CandleData candleData = new CandleData(candleDataSet);
        priceChart.setData(candleData);
        priceChart.invalidate();

        final int LIMIT_NUM = 75;

        priceChart.setVisibleXRange(10,LIMIT_NUM); //한 화면에 보이는 갯수
//        //가장 최근의 데이터로 스크롤해줌.
        priceChart.moveViewToX(priceChart.getData().getEntryCount() - (LIMIT_NUM+1));
    }

}
