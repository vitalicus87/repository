package org.example.homework_31;

import com.sun.org.apache.xpath.internal.objects.XString;

public class TemperatureConverter {


    int tempiratura;
    char converto;
    public static void main(String[] args){


        String name = "value";
        double far = 56.4;
        int cel = 12;

        double celsius = toCelsius(far);
        double faringate = toFaringate(cel);

        System.out.println(celsius);
        System.out.println(faringate);
    }

    public static double toCelsius(double temp){
        double sum = temp * 0.78;

        return sum;
    }

    public static double toFaringate(double temp){
        double sum = temp * 17.56;
        return sum;

    }
}




