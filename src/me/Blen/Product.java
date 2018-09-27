package me.Blen;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0;


    public Product() {
        code="";
        description="";
        price=0;
    }

    @Override
    public String toString(){
        return "Code:           "+code+"\n"+
                "Description    "+description+"\n"+
                "Price          "+this.getFormattedPrice(price)+"\n";

    }

    private String getFormattedPrice(double price){
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        return numberFormat.format(price);
    }

    public static int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
