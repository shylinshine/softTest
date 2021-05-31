package org.example;


import java.util.Locale;

public class AreaTest2 {
    Locale locale = Locale.getDefault();

    public  double circleArea(double r) {
        return 3.14 * r * r;
    }
    public  double rectangleArea(double chang, double kuan) {
        return chang * kuan;
    }
    public  double sumArea(double area1,double area2) {
        return  area1 + area2;
    }


}
