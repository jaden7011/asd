package com.example.coin_gogogo.activity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.coin_gogogo.R;
import com.example.coin_gogogo.data.Candle;
import com.example.coin_gogogo.data.Candle_List;
import com.example.coin_gogogo.data.Coin_Map;
import com.example.coin_gogogo.databinding.ActivityBoardBinding;
import com.github.mikephil.charting.charts.CandleStickChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BoardActivity extends AppCompatActivity {

    ActivityBoardBinding binding;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private String name;
    private CandleStickChart candleStickChart;
    private RequestQueue requestQueue;
    private final Coin_Map coin_map = new Coin_Map();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_board);

        if (requestQueue == null)
            requestQueue = Volley.newRequestQueue(getApplicationContext());

        candleStickChart = binding.priceChart;
        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("name");
        setToolbar();

        for(Map.Entry<String,String> entry : coin_map.getCoin_names().entrySet()){
            if(name.equals(entry.getValue()))
                Get_Candlestick(entry.getKey());
        }
    }

    public void setToolbar () {
        toolbar = findViewById(R.id.toolbar_post);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);//기본 제목을 없애줍니다.
        actionBar.setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle(name);
    }

    private void Get_Candlestick(String CoinNm){

        final String CoinName = CoinNm;
        String url = "https://api.bithumb.com/public/candlestick/"+CoinNm+"_KRW/24h";

        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("onResponse_Candlestick","onResponse 진입");
                        Candle_Respose(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("onErrorResponse","에러남: "+error);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                return params;
            }
        };
        stringRequest.setShouldCache(false);
        requestQueue.add(stringRequest);
    }

    private void Candle_Respose(String response){
        Gson gson = new Gson();
        //원하는 형태로 받아오기.....짱인데?
        Candle_List dataList = gson.fromJson(response, Candle_List.class);

        //상태값이 성공일 때 -> 데이터 뿌려줄 예정
        if(dataList.status.equals("0000")){
            Log.d("Respose","R:");
            ArrayList<Candle> candles = new ArrayList<>();

            for(int x=0; x<dataList.data.size();x++) {
                Candle candle = String_to_candle(dataList.data.get(x).toString());
                candles.add(candle);
            }

            initChart(candleStickChart);
            Set_priceData(candleStickChart,candles);
        }
    }

    public Candle String_to_candle(String str){
        str = str.replace("[","");
        str = str.replace("]","");
//        Log.d("str_to_candle",str);

        Candle candle = new Candle();
        StringTokenizer stk = new StringTokenizer(str,",");
        BigDecimal b2 = new BigDecimal(Double.parseDouble(stk.nextToken())); //이렇게 하면 지수표기 안붙음

//        Log.d("str_to_candle",b2.toString());

        Long createdAt = Long.parseLong(b2.toString());
        float open = Float.parseFloat(stk.nextToken());
        float close = Float.parseFloat(stk.nextToken());
        float high = Float.parseFloat(stk.nextToken());
        float low = Float.parseFloat(stk.nextToken());
        float bids = Float.parseFloat(stk.nextToken());

//        Log.d("str_to_candle","creat: "+createdAt+"\nhigh: "+high+"\nlow: "+low+"\nopen: "+open+"\nclose: "+close);

        candle.createdAt = createdAt;
        candle.open = open;
        candle.close = close;
        candle.high = high;
        candle.low = low;
        candle.bids = bids;

        return candle;
    }

    public void initChart(CandleStickChart priceChart){
        priceChart.getDescription().setEnabled(false);
        priceChart.setMaxVisibleValueCount(100);
        priceChart.setPinchZoom(true);
        priceChart.setDrawGridBackground(false);

        //x축
        XAxis xAxis = priceChart.getXAxis();
//        xAxis.setTextColor(Color.BLACK);
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//        //세로선 표시여부
//        xAxis.setDrawGridLines(false);
//        xAxis.setAxisLineColor(Color.rgb(50,59,76));
//        xAxis.setGridColor(Color.rgb(50,59,76));
        xAxis.setEnabled(false);

        //왼쪽 y축
        YAxis Left_Axis = priceChart.getAxisLeft();
        Left_Axis.setEnabled(false);

        //오른쪽 y축
        YAxis Right_Axis = priceChart.getAxisRight();
        Right_Axis.setLabelCount(4,false);
        Right_Axis.setTextColor(Color.BLACK);

        //가로선 표시여부
        Right_Axis.setDrawGridLines(true);
        // 차트의 오른쪽 테두리 라인 설정
        Right_Axis.setDrawAxisLine(true);
        Right_Axis.setAxisLineColor(Color.rgb(50,59,76));
        Right_Axis.setGridColor(Color.rgb(50,59,79));

        priceChart.getLegend().setEnabled(true);
    }

    public void Set_priceData(CandleStickChart priceChart,ArrayList<Candle> candles) {
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

        final int LIMIT_NUM = 100;

        priceChart.setVisibleXRange(10,LIMIT_NUM); //한 화면에 보이는 갯수
        //가장 최근의 데이터로 스크롤해줌.
        priceChart.moveViewToX(priceChart.getData().getEntryCount() - (LIMIT_NUM+1));
    }


}