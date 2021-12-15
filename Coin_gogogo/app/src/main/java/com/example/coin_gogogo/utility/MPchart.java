package com.example.coin_gogogo.utility;

import android.graphics.Color;
import android.graphics.Paint;

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

    MPchart(CandleStickChart candleStickChart){
        this.candleStickChart = candleStickChart;
    }

    public static MPchart getInstance(CandleStickChart candleStickChart){
        if(instance == null)
            instance = new MPchart(candleStickChart);

        return instance;
    }

    public void Init_Chart(){
        CandleStickChart priceChart = this.candleStickChart;

        priceChart.getDescription().setEnabled(false);
//        priceChart.setMaxVisibleValueCount(50);
        priceChart.setPinchZoom(true);
        priceChart.setDrawGridBackground(false);

        //x축
        XAxis xAxis = priceChart.getXAxis();
//        xAxis.setTextColor(Color.BLACK);
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//        //세로선 표시여부
//        xAxis.setDrawGridLines(false);
        xAxis.setAxisLineColor(Color.BLACK);
//        xAxis.setGridColor(Color.rgb(50,59,76));
        xAxis.setEnabled(false);

        //왼쪽 y축
        YAxis Left_Axis = priceChart.getAxisLeft();
        Left_Axis.setEnabled(false);

        //오른쪽 y축
        YAxis Right_Axis = priceChart.getAxisRight();
        Right_Axis.setLabelCount(3,false);
        Right_Axis.setTextColor(Color.BLACK);

        //가로선 표시여부
        Right_Axis.setDrawGridLines(true);
        // 차트의 오른쪽 테두리 라인 설정
        Right_Axis.setDrawAxisLine(true);
        Right_Axis.setAxisLineColor(Color.BLACK);
        Right_Axis.setGridColor(Color.rgb(50,59,79));

        priceChart.setAutoScaleMinMaxEnabled(true);
        priceChart.getLegend().setEnabled(true);
    }

    public void Set_priceData(ArrayList<Candle> candles) {
        CandleStickChart priceChart = this.candleStickChart;

        List<CandleEntry> candleEntries = new ArrayList<>();

        for (int x = 0; x < candles.size(); x++) {
            candleEntries.add(new CandleEntry(
                    // todo 인식이 안되는 ,,
//                    (float)candles.get(x).createdAt,
                    x,
                    candles.get(x).high,
                    candles.get(x).low,
                    candles.get(x).open,
                    candles.get(x).close
            ));

//            Log.d("candle", "creat: " + candles.get(x).createdAt + "\nhigh: " + candles.get(x).high + "\nlow: " + candles.get(x).low + "\nopen: " + candles.get(x).open + "\nclose: " + candles.get(x).close);
        }

        CandleDataSet candleDataSet = new CandleDataSet(candleEntries, "");
        candleDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
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
        candleDataSet.setDrawValues(false);

        // 터치시 노란 선 제거
//      candleDataSet.setHighLightColor(Color.TRANSPARENT);

        CandleData candleData = new CandleData(candleDataSet);
        priceChart.setData(candleData);
        priceChart.invalidate();

        final int LIMIT_NUM = 30;

        priceChart.setVisibleXRange(10,LIMIT_NUM); //한 화면에 보이는 갯수
        //가장 최근의 데이터로 스크롤해줌.
        priceChart.moveViewToX(priceChart.getData().getEntryCount() - (LIMIT_NUM+1));
    }

    public CandleStickChart getCandleStickChart() {
        return candleStickChart;
    }
}
