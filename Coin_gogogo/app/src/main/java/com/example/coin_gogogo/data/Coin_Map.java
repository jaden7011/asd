package com.example.coin_gogogo.data;

import java.util.HashMap;
import java.util.Map;

public class Coin_Map {
    private final Map<String,String> Coin_names = new HashMap<>();
    private final Map<String,Coin_Info> Coins_map = new HashMap<>();

    public Coin_Map() {
        this.Coin_names.put("BTC","비트코인");
        this.Coin_names.put("ETH","이더리움");
        this.Coin_names.put("ASM","어셈블프로토콜");
        this.Coin_names.put("XRP","리플");
        this.Coin_names.put("WEMIX","위믹스");
        this.Coin_names.put("SOL","솔라나");
        this.Coin_names.put("WIKEN","위드");
        this.Coin_names.put("DOGE","도지코인");
        this.Coin_names.put("MIX","믹스마블");
        this.Coin_names.put("ETC","이더리움 클래식");
        this.Coin_names.put("KLAY","클레이튼");
        this.Coin_names.put("ADA","에이다");
        this.Coin_names.put("AXS","엑시인피니티");
        this.Coin_names.put("XNO","제노토큰");
        this.Coin_names.put("LUNA","루나");
        this.Coin_names.put("DOT","폴카닷");
        this.Coin_names.put("EOS","이오스");
        this.Coin_names.put("OMG","오미세고");
        this.Coin_names.put("XPR","프로톤");
        this.Coin_names.put("LINK","체인링크");
        this.Coin_names.put("EL","엘리시아");
        this.Coin_names.put("TRX","트론");
        this.Coin_names.put("XLM","스텔라루멘");
        this.Coin_names.put("MAP","맵프로토콜");
        this.Coin_names.put("QTUM","퀀텀");
        this.Coin_names.put("NU","누사이퍼");
        this.Coin_names.put("MVC","마일벌스");
        this.Coin_names.put("BCH","비트코인 캐시");
        this.Coin_names.put("YFI","연파이낸스");
        this.Coin_names.put("BTT","비트토렌트");
        this.Coin_names.put("SAND","샌드박스");
        this.Coin_names.put("TEMCO","템코");
        this.Coin_names.put("MLK","밀크");
        this.Coin_names.put("MTL","메탈");
        this.Coin_names.put("META","메타디움");
        this.Coin_names.put("LTC","라이트코인");
    }

    public Map<String, Coin_Info> getCoins_map() {
        return Coins_map;
    }

    public Map<String, String> getCoin_names() {
        return Coin_names;
    }
}
