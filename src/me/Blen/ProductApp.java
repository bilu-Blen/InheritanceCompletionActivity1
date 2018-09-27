package me.Blen;

import static jdk.nashorn.internal.objects.Global.print;

public class ProductApp {
    public static void main(String[] args) {
        Product p = new Product();
        print(p.toString());
    }

    public static void print(String s) {
        System.out.println(s);

    }
}
