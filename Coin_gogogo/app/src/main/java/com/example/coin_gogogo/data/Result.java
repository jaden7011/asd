package com.example.coin_gogogo.data;

import com.google.gson.annotations.SerializedName;

public class Result {

    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.SerializedName; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
    public class BTC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ETH{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LTC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ETC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XRP{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BCH{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class QTUM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BTG{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class EOS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ICX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class TRX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ELF{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class OMG{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class KNC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class GLM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ZIL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WAXP{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class POWR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LRC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class STEEM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class STRAX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ZRX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class REP{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XEM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SNT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ADA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CTXC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BAT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WTC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class THETA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LOOM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WAVES{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class TRUE{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LINK{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ENJ{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class VET{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MTL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class IOST{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class TMTG{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class QKC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class HDAC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class AMO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BSV{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ORBS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class TFUEL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class VALOR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CON{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ANKR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MIX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CRO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class FX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CHR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MBL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MXC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class FCT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class TRV{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class DAD{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WOM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SOC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class EM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BOA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class FLETA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SXP{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class COS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class APIX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class EL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BASIC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class HIVE{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XPR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class VRA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class FIT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class EGG{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BORA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ARPA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class APM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CKB{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class AERGO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ANW{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CENNZ{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class EVZ{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CYCLUB{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SRM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class QTCON{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class UNI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class YFI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class UMA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class AAVE{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class COMP{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class REN{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BAL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class RSR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class NMR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class RLC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class UOS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SAND{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class GOM2{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class RINGX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BEL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class OBSR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ORC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class POLA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class AWO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ADP{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class DVI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class GHX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MIR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MVC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BLY{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WOZX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ANV{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class GRT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BIOT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XNO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SNX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class RAI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class COLA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class NU{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class OXT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LINA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MAP{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class AQT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WIKEN{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CTSI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MANA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LPT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MKR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SUSHI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ASM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class PUNDIX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CELR{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LF{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ARW{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MSB{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class RLY{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class OCEAN{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BFC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ALICE{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CAKE{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BNT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XVS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CHZ{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class AXS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class DAI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MATIC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BAKE{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class VELO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BCD{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XLM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class GXC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BTT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class VSYS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class IPX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WICC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ONT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class LUNA{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class AION{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class META{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class KLAY{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ONG{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ALGO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class JST{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XTZ{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class MLK{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class WEMIX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class DOT{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class ATOM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SSX{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class TEMCO{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class HIBS{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BURGER{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class DOGE{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class KSM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class CTK{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XYM{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class BNB{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SUN{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class XEC{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class PCI{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class SOL{
        @SerializedName("opening_price")
        public String getOpening_price() {
            return this.opening_price; }
        public void setOpening_price(String opening_price) {
            this.opening_price = opening_price; }
        String opening_price;
        @SerializedName("closing_price")
        public String getClosing_price() {
            return this.closing_price; }
        public void setClosing_price(String closing_price) {
            this.closing_price = closing_price; }
        String closing_price;
        @SerializedName("min_price")
        public String getMin_price() {
            return this.min_price; }
        public void setMin_price(String min_price) {
            this.min_price = min_price; }
        String min_price;
        @SerializedName("max_price")
        public String getMax_price() {
            return this.max_price; }
        public void setMax_price(String max_price) {
            this.max_price = max_price; }
        String max_price;
        @SerializedName("units_traded")
        public String getUnits_traded() {
            return this.units_traded; }
        public void setUnits_traded(String units_traded) {
            this.units_traded = units_traded; }
        String units_traded;
        @SerializedName("acc_trade_value")
        public String getAcc_trade_value() {
            return this.acc_trade_value; }
        public void setAcc_trade_value(String acc_trade_value) {
            this.acc_trade_value = acc_trade_value; }
        String acc_trade_value;
        @SerializedName("prev_closing_price")
        public String getPrev_closing_price() {
            return this.prev_closing_price; }
        public void setPrev_closing_price(String prev_closing_price) {
            this.prev_closing_price = prev_closing_price; }
        String prev_closing_price;
        @SerializedName("units_traded_24H")
        public String getUnits_traded_24H() {
            return this.units_traded_24H; }
        public void setUnits_traded_24H(String units_traded_24H) {
            this.units_traded_24H = units_traded_24H; }
        String units_traded_24H;
        @SerializedName("acc_trade_value_24H")
        public String getAcc_trade_value_24H() {
            return this.acc_trade_value_24H; }
        public void setAcc_trade_value_24H(String acc_trade_value_24H) {
            this.acc_trade_value_24H = acc_trade_value_24H; }
        String acc_trade_value_24H;
        @SerializedName("fluctate_24H")
        public String getFluctate_24H() {
            return this.fluctate_24H; }
        public void setFluctate_24H(String fluctate_24H) {
            this.fluctate_24H = fluctate_24H; }
        String fluctate_24H;
        @SerializedName("fluctate_rate_24H")
        public String getFluctate_rate_24H() {
            return this.fluctate_rate_24H; }
        public void setFluctate_rate_24H(String fluctate_rate_24H) {
            this.fluctate_rate_24H = fluctate_rate_24H; }
        String fluctate_rate_24H;
    }

    public class Data{
        @SerializedName("BTC")
        public BTC getBTC() {
            return this.bTC; }
        public void setBTC(BTC bTC) {
            this.bTC = bTC; }
        BTC bTC;
        @SerializedName("ETH")
        public ETH getETH() {
            return this.eTH; }
        public void setETH(ETH eTH) {
            this.eTH = eTH; }
        ETH eTH;
        @SerializedName("LTC")
        public LTC getLTC() {
            return this.lTC; }
        public void setLTC(LTC lTC) {
            this.lTC = lTC; }
        LTC lTC;
        @SerializedName("ETC")
        public ETC getETC() {
            return this.eTC; }
        public void setETC(ETC eTC) {
            this.eTC = eTC; }
        ETC eTC;
        @SerializedName("XRP")
        public XRP getXRP() {
            return this.xRP; }
        public void setXRP(XRP xRP) {
            this.xRP = xRP; }
        XRP xRP;
        @SerializedName("BCH")
        public BCH getBCH() {
            return this.bCH; }
        public void setBCH(BCH bCH) {
            this.bCH = bCH; }
        BCH bCH;
        @SerializedName("QTUM")
        public QTUM getQTUM() {
            return this.qTUM; }
        public void setQTUM(QTUM qTUM) {
            this.qTUM = qTUM; }
        QTUM qTUM;
        @SerializedName("BTG")
        public BTG getBTG() {
            return this.bTG; }
        public void setBTG(BTG bTG) {
            this.bTG = bTG; }
        BTG bTG;
        @SerializedName("EOS")
        public EOS getEOS() {
            return this.eOS; }
        public void setEOS(EOS eOS) {
            this.eOS = eOS; }
        EOS eOS;
        @SerializedName("ICX")
        public ICX getICX() {
            return this.iCX; }
        public void setICX(ICX iCX) {
            this.iCX = iCX; }
        ICX iCX;
        @SerializedName("TRX")
        public TRX getTRX() {
            return this.tRX; }
        public void setTRX(TRX tRX) {
            this.tRX = tRX; }
        TRX tRX;
        @SerializedName("ELF")
        public ELF getELF() {
            return this.eLF; }
        public void setELF(ELF eLF) {
            this.eLF = eLF; }
        ELF eLF;
        @SerializedName("OMG")
        public OMG getOMG() {
            return this.oMG; }
        public void setOMG(OMG oMG) {
            this.oMG = oMG; }
        OMG oMG;
        @SerializedName("KNC")
        public KNC getKNC() {
            return this.kNC; }
        public void setKNC(KNC kNC) {
            this.kNC = kNC; }
        KNC kNC;
        @SerializedName("GLM")
        public GLM getGLM() {
            return this.gLM; }
        public void setGLM(GLM gLM) {
            this.gLM = gLM; }
        GLM gLM;
        @SerializedName("ZIL")
        public ZIL getZIL() {
            return this.zIL; }
        public void setZIL(ZIL zIL) {
            this.zIL = zIL; }
        ZIL zIL;
        @SerializedName("WAXP")
        public WAXP getWAXP() {
            return this.wAXP; }
        public void setWAXP(WAXP wAXP) {
            this.wAXP = wAXP; }
        WAXP wAXP;
        @SerializedName("POWR")
        public POWR getPOWR() {
            return this.pOWR; }
        public void setPOWR(POWR pOWR) {
            this.pOWR = pOWR; }
        POWR pOWR;
        @SerializedName("LRC")
        public LRC getLRC() {
            return this.lRC; }
        public void setLRC(LRC lRC) {
            this.lRC = lRC; }
        LRC lRC;
        @SerializedName("STEEM")
        public STEEM getSTEEM() {
            return this.sTEEM; }
        public void setSTEEM(STEEM sTEEM) {
            this.sTEEM = sTEEM; }
        STEEM sTEEM;
        @SerializedName("STRAX")
        public STRAX getSTRAX() {
            return this.sTRAX; }
        public void setSTRAX(STRAX sTRAX) {
            this.sTRAX = sTRAX; }
        STRAX sTRAX;
        @SerializedName("ZRX")
        public ZRX getZRX() {
            return this.zRX; }
        public void setZRX(ZRX zRX) {
            this.zRX = zRX; }
        ZRX zRX;
        @SerializedName("REP")
        public REP getREP() {
            return this.rEP; }
        public void setREP(REP rEP) {
            this.rEP = rEP; }
        REP rEP;
        @SerializedName("XEM")
        public XEM getXEM() {
            return this.xEM; }
        public void setXEM(XEM xEM) {
            this.xEM = xEM; }
        XEM xEM;
        @SerializedName("SNT")
        public SNT getSNT() {
            return this.sNT; }
        public void setSNT(SNT sNT) {
            this.sNT = sNT; }
        SNT sNT;
        @SerializedName("ADA")
        public ADA getADA() {
            return this.aDA; }
        public void setADA(ADA aDA) {
            this.aDA = aDA; }
        ADA aDA;
        @SerializedName("CTXC")
        public CTXC getCTXC() {
            return this.cTXC; }
        public void setCTXC(CTXC cTXC) {
            this.cTXC = cTXC; }
        CTXC cTXC;
        @SerializedName("BAT")
        public BAT getBAT() {
            return this.bAT; }
        public void setBAT(BAT bAT) {
            this.bAT = bAT; }
        BAT bAT;
        @SerializedName("WTC")
        public WTC getWTC() {
            return this.wTC; }
        public void setWTC(WTC wTC) {
            this.wTC = wTC; }
        WTC wTC;
        @SerializedName("THETA")
        public THETA getTHETA() {
            return this.tHETA; }
        public void setTHETA(THETA tHETA) {
            this.tHETA = tHETA; }
        THETA tHETA;
        @SerializedName("LOOM")
        public LOOM getLOOM() {
            return this.lOOM; }
        public void setLOOM(LOOM lOOM) {
            this.lOOM = lOOM; }
        LOOM lOOM;
        @SerializedName("WAVES")
        public WAVES getWAVES() {
            return this.wAVES; }
        public void setWAVES(WAVES wAVES) {
            this.wAVES = wAVES; }
        WAVES wAVES;
        @SerializedName("TRUE")
        public TRUE getTRUE() {
            return this.tRUE; }
        public void setTRUE(TRUE tRUE) {
            this.tRUE = tRUE; }
        TRUE tRUE;
        @SerializedName("LINK")
        public LINK getLINK() {
            return this.lINK; }
        public void setLINK(LINK lINK) {
            this.lINK = lINK; }
        LINK lINK;
        @SerializedName("ENJ")
        public ENJ getENJ() {
            return this.eNJ; }
        public void setENJ(ENJ eNJ) {
            this.eNJ = eNJ; }
        ENJ eNJ;
        @SerializedName("VET")
        public VET getVET() {
            return this.vET; }
        public void setVET(VET vET) {
            this.vET = vET; }
        VET vET;
        @SerializedName("MTL")
        public MTL getMTL() {
            return this.mTL; }
        public void setMTL(MTL mTL) {
            this.mTL = mTL; }
        MTL mTL;
        @SerializedName("IOST")
        public IOST getIOST() {
            return this.iOST; }
        public void setIOST(IOST iOST) {
            this.iOST = iOST; }
        IOST iOST;
        @SerializedName("TMTG")
        public TMTG getTMTG() {
            return this.tMTG; }
        public void setTMTG(TMTG tMTG) {
            this.tMTG = tMTG; }
        TMTG tMTG;
        @SerializedName("QKC")
        public QKC getQKC() {
            return this.qKC; }
        public void setQKC(QKC qKC) {
            this.qKC = qKC; }
        QKC qKC;
        @SerializedName("HDAC")
        public HDAC getHDAC() {
            return this.hDAC; }
        public void setHDAC(HDAC hDAC) {
            this.hDAC = hDAC; }
        HDAC hDAC;
        @SerializedName("AMO")
        public AMO getAMO() {
            return this.aMO; }
        public void setAMO(AMO aMO) {
            this.aMO = aMO; }
        AMO aMO;
        @SerializedName("BSV")
        public BSV getBSV() {
            return this.bSV; }
        public void setBSV(BSV bSV) {
            this.bSV = bSV; }
        BSV bSV;
        @SerializedName("ORBS")
        public ORBS getORBS() {
            return this.oRBS; }
        public void setORBS(ORBS oRBS) {
            this.oRBS = oRBS; }
        ORBS oRBS;
        @SerializedName("TFUEL")
        public TFUEL getTFUEL() {
            return this.tFUEL; }
        public void setTFUEL(TFUEL tFUEL) {
            this.tFUEL = tFUEL; }
        TFUEL tFUEL;
        @SerializedName("VALOR")
        public VALOR getVALOR() {
            return this.vALOR; }
        public void setVALOR(VALOR vALOR) {
            this.vALOR = vALOR; }
        VALOR vALOR;
        @SerializedName("CON")
        public CON getCON() {
            return this.cON; }
        public void setCON(CON cON) {
            this.cON = cON; }
        CON cON;
        @SerializedName("ANKR")
        public ANKR getANKR() {
            return this.aNKR; }
        public void setANKR(ANKR aNKR) {
            this.aNKR = aNKR; }
        ANKR aNKR;
        @SerializedName("MIX")
        public MIX getMIX() {
            return this.mIX; }
        public void setMIX(MIX mIX) {
            this.mIX = mIX; }
        MIX mIX;
        @SerializedName("CRO")
        public CRO getCRO() {
            return this.cRO; }
        public void setCRO(CRO cRO) {
            this.cRO = cRO; }
        CRO cRO;
        @SerializedName("FX")
        public FX getFX() {
            return this.fX; }
        public void setFX(FX fX) {
            this.fX = fX; }
        FX fX;
        @SerializedName("CHR")
        public CHR getCHR() {
            return this.cHR; }
        public void setCHR(CHR cHR) {
            this.cHR = cHR; }
        CHR cHR;
        @SerializedName("MBL")
        public MBL getMBL() {
            return this.mBL; }
        public void setMBL(MBL mBL) {
            this.mBL = mBL; }
        MBL mBL;
        @SerializedName("MXC")
        public MXC getMXC() {
            return this.mXC; }
        public void setMXC(MXC mXC) {
            this.mXC = mXC; }
        MXC mXC;
        @SerializedName("FCT")
        public FCT getFCT() {
            return this.fCT; }
        public void setFCT(FCT fCT) {
            this.fCT = fCT; }
        FCT fCT;
        @SerializedName("TRV")
        public TRV getTRV() {
            return this.tRV; }
        public void setTRV(TRV tRV) {
            this.tRV = tRV; }
        TRV tRV;
        @SerializedName("DAD")
        public DAD getDAD() {
            return this.dAD; }
        public void setDAD(DAD dAD) {
            this.dAD = dAD; }
        DAD dAD;
        @SerializedName("WOM")
        public WOM getWOM() {
            return this.wOM; }
        public void setWOM(WOM wOM) {
            this.wOM = wOM; }
        WOM wOM;
        @SerializedName("SOC")
        public SOC getSOC() {
            return this.sOC; }
        public void setSOC(SOC sOC) {
            this.sOC = sOC; }
        SOC sOC;
        @SerializedName("EM")
        public EM getEM() {
            return this.eM; }
        public void setEM(EM eM) {
            this.eM = eM; }
        EM eM;
        @SerializedName("BOA")
        public BOA getBOA() {
            return this.bOA; }
        public void setBOA(BOA bOA) {
            this.bOA = bOA; }
        BOA bOA;
        @SerializedName("FLETA")
        public FLETA getFLETA() {
            return this.fLETA; }
        public void setFLETA(FLETA fLETA) {
            this.fLETA = fLETA; }
        FLETA fLETA;
        @SerializedName("SXP")
        public SXP getSXP() {
            return this.sXP; }
        public void setSXP(SXP sXP) {
            this.sXP = sXP; }
        SXP sXP;
        @SerializedName("COS")
        public COS getCOS() {
            return this.cOS; }
        public void setCOS(COS cOS) {
            this.cOS = cOS; }
        COS cOS;
        @SerializedName("APIX")
        public APIX getAPIX() {
            return this.aPIX; }
        public void setAPIX(APIX aPIX) {
            this.aPIX = aPIX; }
        APIX aPIX;
        @SerializedName("EL")
        public EL getEL() {
            return this.eL; }
        public void setEL(EL eL) {
            this.eL = eL; }
        EL eL;
        @SerializedName("BASIC")
        public BASIC getBASIC() {
            return this.bASIC; }
        public void setBASIC(BASIC bASIC) {
            this.bASIC = bASIC; }
        BASIC bASIC;
        @SerializedName("HIVE")
        public HIVE getHIVE() {
            return this.hIVE; }
        public void setHIVE(HIVE hIVE) {
            this.hIVE = hIVE; }
        HIVE hIVE;
        @SerializedName("XPR")
        public XPR getXPR() {
            return this.xPR; }
        public void setXPR(XPR xPR) {
            this.xPR = xPR; }
        XPR xPR;
        @SerializedName("VRA")
        public VRA getVRA() {
            return this.vRA; }
        public void setVRA(VRA vRA) {
            this.vRA = vRA; }
        VRA vRA;
        @SerializedName("FIT")
        public FIT getFIT() {
            return this.fIT; }
        public void setFIT(FIT fIT) {
            this.fIT = fIT; }
        FIT fIT;
        @SerializedName("EGG")
        public EGG getEGG() {
            return this.eGG; }
        public void setEGG(EGG eGG) {
            this.eGG = eGG; }
        EGG eGG;
        @SerializedName("BORA")
        public BORA getBORA() {
            return this.bORA; }
        public void setBORA(BORA bORA) {
            this.bORA = bORA; }
        BORA bORA;
        @SerializedName("ARPA")
        public ARPA getARPA() {
            return this.aRPA; }
        public void setARPA(ARPA aRPA) {
            this.aRPA = aRPA; }
        ARPA aRPA;
        @SerializedName("APM")
        public APM getAPM() {
            return this.aPM; }
        public void setAPM(APM aPM) {
            this.aPM = aPM; }
        APM aPM;
        @SerializedName("CKB")
        public CKB getCKB() {
            return this.cKB; }
        public void setCKB(CKB cKB) {
            this.cKB = cKB; }
        CKB cKB;
        @SerializedName("AERGO")
        public AERGO getAERGO() {
            return this.aERGO; }
        public void setAERGO(AERGO aERGO) {
            this.aERGO = aERGO; }
        AERGO aERGO;
        @SerializedName("ANW")
        public ANW getANW() {
            return this.aNW; }
        public void setANW(ANW aNW) {
            this.aNW = aNW; }
        ANW aNW;
        @SerializedName("CENNZ")
        public CENNZ getCENNZ() {
            return this.cENNZ; }
        public void setCENNZ(CENNZ cENNZ) {
            this.cENNZ = cENNZ; }
        CENNZ cENNZ;
        @SerializedName("EVZ")
        public EVZ getEVZ() {
            return this.eVZ; }
        public void setEVZ(EVZ eVZ) {
            this.eVZ = eVZ; }
        EVZ eVZ;
        @SerializedName("CYCLUB")
        public CYCLUB getCYCLUB() {
            return this.cYCLUB; }
        public void setCYCLUB(CYCLUB cYCLUB) {
            this.cYCLUB = cYCLUB; }
        CYCLUB cYCLUB;
        @SerializedName("SRM")
        public SRM getSRM() {
            return this.sRM; }
        public void setSRM(SRM sRM) {
            this.sRM = sRM; }
        SRM sRM;
        @SerializedName("QTCON")
        public QTCON getQTCON() {
            return this.qTCON; }
        public void setQTCON(QTCON qTCON) {
            this.qTCON = qTCON; }
        QTCON qTCON;
        @SerializedName("UNI")
        public UNI getUNI() {
            return this.uNI; }
        public void setUNI(UNI uNI) {
            this.uNI = uNI; }
        UNI uNI;
        @SerializedName("YFI")
        public YFI getYFI() {
            return this.yFI; }
        public void setYFI(YFI yFI) {
            this.yFI = yFI; }
        YFI yFI;
        @SerializedName("UMA")
        public UMA getUMA() {
            return this.uMA; }
        public void setUMA(UMA uMA) {
            this.uMA = uMA; }
        UMA uMA;
        @SerializedName("AAVE")
        public AAVE getAAVE() {
            return this.aAVE; }
        public void setAAVE(AAVE aAVE) {
            this.aAVE = aAVE; }
        AAVE aAVE;
        @SerializedName("COMP")
        public COMP getCOMP() {
            return this.cOMP; }
        public void setCOMP(COMP cOMP) {
            this.cOMP = cOMP; }
        COMP cOMP;
        @SerializedName("REN")
        public REN getREN() {
            return this.rEN; }
        public void setREN(REN rEN) {
            this.rEN = rEN; }
        REN rEN;
        @SerializedName("BAL")
        public BAL getBAL() {
            return this.bAL; }
        public void setBAL(BAL bAL) {
            this.bAL = bAL; }
        BAL bAL;
        @SerializedName("RSR")
        public RSR getRSR() {
            return this.rSR; }
        public void setRSR(RSR rSR) {
            this.rSR = rSR; }
        RSR rSR;
        @SerializedName("NMR")
        public NMR getNMR() {
            return this.nMR; }
        public void setNMR(NMR nMR) {
            this.nMR = nMR; }
        NMR nMR;
        @SerializedName("RLC")
        public RLC getRLC() {
            return this.rLC; }
        public void setRLC(RLC rLC) {
            this.rLC = rLC; }
        RLC rLC;
        @SerializedName("UOS")
        public UOS getUOS() {
            return this.uOS; }
        public void setUOS(UOS uOS) {
            this.uOS = uOS; }
        UOS uOS;
        @SerializedName("SAND")
        public SAND getSAND() {
            return this.sAND; }
        public void setSAND(SAND sAND) {
            this.sAND = sAND; }
        SAND sAND;
        @SerializedName("GOM2")
        public GOM2 getGOM2() {
            return this.gOM2; }
        public void setGOM2(GOM2 gOM2) {
            this.gOM2 = gOM2; }
        GOM2 gOM2;
        @SerializedName("RINGX")
        public RINGX getRINGX() {
            return this.rINGX; }
        public void setRINGX(RINGX rINGX) {
            this.rINGX = rINGX; }
        RINGX rINGX;
        @SerializedName("BEL")
        public BEL getBEL() {
            return this.bEL; }
        public void setBEL(BEL bEL) {
            this.bEL = bEL; }
        BEL bEL;
        @SerializedName("OBSR")
        public OBSR getOBSR() {
            return this.oBSR; }
        public void setOBSR(OBSR oBSR) {
            this.oBSR = oBSR; }
        OBSR oBSR;
        @SerializedName("ORC")
        public ORC getORC() {
            return this.oRC; }
        public void setORC(ORC oRC) {
            this.oRC = oRC; }
        ORC oRC;
        @SerializedName("POLA")
        public POLA getPOLA() {
            return this.pOLA; }
        public void setPOLA(POLA pOLA) {
            this.pOLA = pOLA; }
        POLA pOLA;
        @SerializedName("AWO")
        public AWO getAWO() {
            return this.aWO; }
        public void setAWO(AWO aWO) {
            this.aWO = aWO; }
        AWO aWO;
        @SerializedName("ADP")
        public ADP getADP() {
            return this.aDP; }
        public void setADP(ADP aDP) {
            this.aDP = aDP; }
        ADP aDP;
        @SerializedName("DVI")
        public DVI getDVI() {
            return this.dVI; }
        public void setDVI(DVI dVI) {
            this.dVI = dVI; }
        DVI dVI;
        @SerializedName("GHX")
        public GHX getGHX() {
            return this.gHX; }
        public void setGHX(GHX gHX) {
            this.gHX = gHX; }
        GHX gHX;
        @SerializedName("MIR")
        public MIR getMIR() {
            return this.mIR; }
        public void setMIR(MIR mIR) {
            this.mIR = mIR; }
        MIR mIR;
        @SerializedName("MVC")
        public MVC getMVC() {
            return this.mVC; }
        public void setMVC(MVC mVC) {
            this.mVC = mVC; }
        MVC mVC;
        @SerializedName("BLY")
        public BLY getBLY() {
            return this.bLY; }
        public void setBLY(BLY bLY) {
            this.bLY = bLY; }
        BLY bLY;
        @SerializedName("WOZX")
        public WOZX getWOZX() {
            return this.wOZX; }
        public void setWOZX(WOZX wOZX) {
            this.wOZX = wOZX; }
        WOZX wOZX;
        @SerializedName("ANV")
        public ANV getANV() {
            return this.aNV; }
        public void setANV(ANV aNV) {
            this.aNV = aNV; }
        ANV aNV;
        @SerializedName("GRT")
        public GRT getGRT() {
            return this.gRT; }
        public void setGRT(GRT gRT) {
            this.gRT = gRT; }
        GRT gRT;
        @SerializedName("MM")
        public MM getMM() {
            return this.mM; }
        public void setMM(MM mM) {
            this.mM = mM; }
        MM mM;
        @SerializedName("BIOT")
        public BIOT getBIOT() {
            return this.bIOT; }
        public void setBIOT(BIOT bIOT) {
            this.bIOT = bIOT; }
        BIOT bIOT;
        @SerializedName("XNO")
        public XNO getXNO() {
            return this.xNO; }
        public void setXNO(XNO xNO) {
            this.xNO = xNO; }
        XNO xNO;
        @SerializedName("SNX")
        public SNX getSNX() {
            return this.sNX; }
        public void setSNX(SNX sNX) {
            this.sNX = sNX; }
        SNX sNX;
        @SerializedName("RAI")
        public RAI getRAI() {
            return this.rAI; }
        public void setRAI(RAI rAI) {
            this.rAI = rAI; }
        RAI rAI;
        @SerializedName("COLA")
        public COLA getCOLA() {
            return this.cOLA; }
        public void setCOLA(COLA cOLA) {
            this.cOLA = cOLA; }
        COLA cOLA;
        @SerializedName("NU")
        public NU getNU() {
            return this.nU; }
        public void setNU(NU nU) {
            this.nU = nU; }
        NU nU;
        @SerializedName("OXT")
        public OXT getOXT() {
            return this.oXT; }
        public void setOXT(OXT oXT) {
            this.oXT = oXT; }
        OXT oXT;
        @SerializedName("LINA")
        public LINA getLINA() {
            return this.lINA; }
        public void setLINA(LINA lINA) {
            this.lINA = lINA; }
        LINA lINA;
        @SerializedName("MAP")
        public MAP getMAP() {
            return this.mAP; }
        public void setMAP(MAP mAP) {
            this.mAP = mAP; }
        MAP mAP;
        @SerializedName("AQT")
        public AQT getAQT() {
            return this.aQT; }
        public void setAQT(AQT aQT) {
            this.aQT = aQT; }
        AQT aQT;
        @SerializedName("WIKEN")
        public WIKEN getWIKEN() {
            return this.wIKEN; }
        public void setWIKEN(WIKEN wIKEN) {
            this.wIKEN = wIKEN; }
        WIKEN wIKEN;
        @SerializedName("CTSI")
        public CTSI getCTSI() {
            return this.cTSI; }
        public void setCTSI(CTSI cTSI) {
            this.cTSI = cTSI; }
        CTSI cTSI;
        @SerializedName("MANA")
        public MANA getMANA() {
            return this.mANA; }
        public void setMANA(MANA mANA) {
            this.mANA = mANA; }
        MANA mANA;
        @SerializedName("LPT")
        public LPT getLPT() {
            return this.lPT; }
        public void setLPT(LPT lPT) {
            this.lPT = lPT; }
        LPT lPT;
        @SerializedName("MKR")
        public MKR getMKR() {
            return this.mKR; }
        public void setMKR(MKR mKR) {
            this.mKR = mKR; }
        MKR mKR;
        @SerializedName("SUSHI")
        public SUSHI getSUSHI() {
            return this.sUSHI; }
        public void setSUSHI(SUSHI sUSHI) {
            this.sUSHI = sUSHI; }
        SUSHI sUSHI;
        @SerializedName("ASM")
        public ASM getASM() {
            return this.aSM; }
        public void setASM(ASM aSM) {
            this.aSM = aSM; }
        ASM aSM;
        @SerializedName("PUNDIX")
        public PUNDIX getPUNDIX() {
            return this.pUNDIX; }
        public void setPUNDIX(PUNDIX pUNDIX) {
            this.pUNDIX = pUNDIX; }
        PUNDIX pUNDIX;
        @SerializedName("CELR")
        public CELR getCELR() {
            return this.cELR; }
        public void setCELR(CELR cELR) {
            this.cELR = cELR; }
        CELR cELR;
        @SerializedName("LF")
        public LF getLF() {
            return this.lF; }
        public void setLF(LF lF) {
            this.lF = lF; }
        LF lF;
        @SerializedName("ARW")
        public ARW getARW() {
            return this.aRW; }
        public void setARW(ARW aRW) {
            this.aRW = aRW; }
        ARW aRW;
        @SerializedName("MSB")
        public MSB getMSB() {
            return this.mSB; }
        public void setMSB(MSB mSB) {
            this.mSB = mSB; }
        MSB mSB;
        @SerializedName("RLY")
        public RLY getRLY() {
            return this.rLY; }
        public void setRLY(RLY rLY) {
            this.rLY = rLY; }
        RLY rLY;
        @SerializedName("OCEAN")
        public OCEAN getOCEAN() {
            return this.oCEAN; }
        public void setOCEAN(OCEAN oCEAN) {
            this.oCEAN = oCEAN; }
        OCEAN oCEAN;
        @SerializedName("BFC")
        public BFC getBFC() {
            return this.bFC; }
        public void setBFC(BFC bFC) {
            this.bFC = bFC; }
        BFC bFC;
        @SerializedName("ALICE")
        public ALICE getALICE() {
            return this.aLICE; }
        public void setALICE(ALICE aLICE) {
            this.aLICE = aLICE; }
        ALICE aLICE;
        @SerializedName("CAKE")
        public CAKE getCAKE() {
            return this.cAKE; }
        public void setCAKE(CAKE cAKE) {
            this.cAKE = cAKE; }
        CAKE cAKE;
        @SerializedName("BNT")
        public BNT getBNT() {
            return this.bNT; }
        public void setBNT(BNT bNT) {
            this.bNT = bNT; }
        BNT bNT;
        @SerializedName("XVS")
        public XVS getXVS() {
            return this.xVS; }
        public void setXVS(XVS xVS) {
            this.xVS = xVS; }
        XVS xVS;
        @SerializedName("CHZ")
        public CHZ getCHZ() {
            return this.cHZ; }
        public void setCHZ(CHZ cHZ) {
            this.cHZ = cHZ; }
        CHZ cHZ;
        @SerializedName("AXS")
        public AXS getAXS() {
            return this.aXS; }
        public void setAXS(AXS aXS) {
            this.aXS = aXS; }
        AXS aXS;
        @SerializedName("DAI")
        public DAI getDAI() {
            return this.dAI; }
        public void setDAI(DAI dAI) {
            this.dAI = dAI; }
        DAI dAI;
        @SerializedName("MATIC")
        public MATIC getMATIC() {
            return this.mATIC; }
        public void setMATIC(MATIC mATIC) {
            this.mATIC = mATIC; }
        MATIC mATIC;
        @SerializedName("BAKE")
        public BAKE getBAKE() {
            return this.bAKE; }
        public void setBAKE(BAKE bAKE) {
            this.bAKE = bAKE; }
        BAKE bAKE;
        @SerializedName("VELO")
        public VELO getVELO() {
            return this.vELO; }
        public void setVELO(VELO vELO) {
            this.vELO = vELO; }
        VELO vELO;
        @SerializedName("BCD")
        public BCD getBCD() {
            return this.bCD; }
        public void setBCD(BCD bCD) {
            this.bCD = bCD; }
        BCD bCD;
        @SerializedName("XLM")
        public XLM getXLM() {
            return this.xLM; }
        public void setXLM(XLM xLM) {
            this.xLM = xLM; }
        XLM xLM;
        @SerializedName("GXC")
        public GXC getGXC() {
            return this.gXC; }
        public void setGXC(GXC gXC) {
            this.gXC = gXC; }
        GXC gXC;
        @SerializedName("BTT")
        public BTT getBTT() {
            return this.bTT; }
        public void setBTT(BTT bTT) {
            this.bTT = bTT; }
        BTT bTT;
        @SerializedName("VSYS")
        public VSYS getVSYS() {
            return this.vSYS; }
        public void setVSYS(VSYS vSYS) {
            this.vSYS = vSYS; }
        VSYS vSYS;
        @SerializedName("IPX")
        public IPX getIPX() {
            return this.iPX; }
        public void setIPX(IPX iPX) {
            this.iPX = iPX; }
        IPX iPX;
        @SerializedName("WICC")
        public WICC getWICC() {
            return this.wICC; }
        public void setWICC(WICC wICC) {
            this.wICC = wICC; }
        WICC wICC;
        @SerializedName("ONT")
        public ONT getONT() {
            return this.oNT; }
        public void setONT(ONT oNT) {
            this.oNT = oNT; }
        ONT oNT;
        @SerializedName("LUNA")
        public LUNA getLUNA() {
            return this.lUNA; }
        public void setLUNA(LUNA lUNA) {
            this.lUNA = lUNA; }
        LUNA lUNA;
        @SerializedName("AION")
        public AION getAION() {
            return this.aION; }
        public void setAION(AION aION) {
            this.aION = aION; }
        AION aION;
        @SerializedName("META")
        public META getMETA() {
            return this.mETA; }
        public void setMETA(META mETA) {
            this.mETA = mETA; }
        META mETA;
        @SerializedName("KLAY")
        public KLAY getKLAY() {
            return this.kLAY; }
        public void setKLAY(KLAY kLAY) {
            this.kLAY = kLAY; }
        KLAY kLAY;
        @SerializedName("ONG")
        public ONG getONG() {
            return this.oNG; }
        public void setONG(ONG oNG) {
            this.oNG = oNG; }
        ONG oNG;
        @SerializedName("ALGO")
        public ALGO getALGO() {
            return this.aLGO; }
        public void setALGO(ALGO aLGO) {
            this.aLGO = aLGO; }
        ALGO aLGO;
        @SerializedName("JST")
        public JST getJST() {
            return this.jST; }
        public void setJST(JST jST) {
            this.jST = jST; }
        JST jST;
        @SerializedName("XTZ")
        public XTZ getXTZ() {
            return this.xTZ; }
        public void setXTZ(XTZ xTZ) {
            this.xTZ = xTZ; }
        XTZ xTZ;
        @SerializedName("MLK")
        public MLK getMLK() {
            return this.mLK; }
        public void setMLK(MLK mLK) {
            this.mLK = mLK; }
        MLK mLK;
        @SerializedName("WEMIX")
        public WEMIX getWEMIX() {
            return this.wEMIX; }
        public void setWEMIX(WEMIX wEMIX) {
            this.wEMIX = wEMIX; }
        WEMIX wEMIX;
        @SerializedName("DOT")
        public DOT getDOT() {
            return this.dOT; }
        public void setDOT(DOT dOT) {
            this.dOT = dOT; }
        DOT dOT;
        @SerializedName("ATOM")
        public ATOM getATOM() {
            return this.aTOM; }
        public void setATOM(ATOM aTOM) {
            this.aTOM = aTOM; }
        ATOM aTOM;
        @SerializedName("SSX")
        public SSX getSSX() {
            return this.sSX; }
        public void setSSX(SSX sSX) {
            this.sSX = sSX; }
        SSX sSX;
        @SerializedName("TEMCO")
        public TEMCO getTEMCO() {
            return this.tEMCO; }
        public void setTEMCO(TEMCO tEMCO) {
            this.tEMCO = tEMCO; }
        TEMCO tEMCO;
        @SerializedName("HIBS")
        public HIBS getHIBS() {
            return this.hIBS; }
        public void setHIBS(HIBS hIBS) {
            this.hIBS = hIBS; }
        HIBS hIBS;
        @SerializedName("BURGER")
        public BURGER getBURGER() {
            return this.bURGER; }
        public void setBURGER(BURGER bURGER) {
            this.bURGER = bURGER; }
        BURGER bURGER;
        @SerializedName("DOGE")
        public DOGE getDOGE() {
            return this.dOGE; }
        public void setDOGE(DOGE dOGE) {
            this.dOGE = dOGE; }
        DOGE dOGE;
        @SerializedName("KSM")
        public KSM getKSM() {
            return this.kSM; }
        public void setKSM(KSM kSM) {
            this.kSM = kSM; }
        KSM kSM;
        @SerializedName("CTK")
        public CTK getCTK() {
            return this.cTK; }
        public void setCTK(CTK cTK) {
            this.cTK = cTK; }
        CTK cTK;
        @SerializedName("XYM")
        public XYM getXYM() {
            return this.xYM; }
        public void setXYM(XYM xYM) {
            this.xYM = xYM; }
        XYM xYM;
        @SerializedName("BNB")
        public BNB getBNB() {
            return this.bNB; }
        public void setBNB(BNB bNB) {
            this.bNB = bNB; }
        BNB bNB;
        @SerializedName("SUN")
        public SUN getSUN() {
            return this.sUN; }
        public void setSUN(SUN sUN) {
            this.sUN = sUN; }
        SUN sUN;
        @SerializedName("XEC")
        public XEC getXEC() {
            return this.xEC; }
        public void setXEC(XEC xEC) {
            this.xEC = xEC; }
        XEC xEC;
        @SerializedName("PCI")
        public PCI getPCI() {
            return this.pCI; }
        public void setPCI(PCI pCI) {
            this.pCI = pCI; }
        PCI pCI;
        @SerializedName("SOL")
        public SOL getSOL() {
            return this.sOL; }
        public void setSOL(SOL sOL) {
            this.sOL = sOL; }
        SOL sOL;
        @SerializedName("date")
        public String getDate() {
            return this.date; }
        public void setDate(String date) {
            this.date = date; }
        String date;
    }

    public class Root{
        @SerializedName("status")
        public String getStatus() {
            return this.status; }
        public void setStatus(String status) {
            this.status = status; }
        String status;
        @SerializedName("data")
        public Data getData() {
            return this.data; }
        public void setData(Data data) {
            this.data = data; }
        Data data;
    }



}
