package com.company;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PurchaceData {
    private Object date;
    private int price;
    private String currency;
    private String goods;


    public PurchaceData(Object date,int price,String currency,String goods){
        this.date = date;
        this.price = price;
        this.currency = currency;
        this.goods = goods;
    }

//   public static String CheckIsEmpty() {
//   }

}
