package com.example.coin_gogogo.info;

public class Coin_Info {
    public String Name;
    public String Name_sub;
    public String Price;
    public String Pre_Price;
    public String Rate;
    public String Total;

    public Coin_Info(String name,String name_sub, String price, String rate, String total) {
        Name = name;
        Name_sub = name_sub;
        Price = price;
        Rate = rate;
        Total = total;
    }

    public String getName_sub() {
        return Name_sub;
    }

    public void setName_sub(String name_sub) {
        Name_sub = name_sub;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getPre_Price() {
        return Pre_Price;
    }

    public void setPre_Price(String pre_Price) {
        Pre_Price = pre_Price;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }
}
