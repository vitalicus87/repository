package org.example.homework_31;

import com.sun.org.apache.xpath.internal.objects.XString;

public class TemperatureConverter {


    int Temperatura;
    char converter;
    public static void main(String[] args){
        TemperatureConverter toCelsius  = new TemperatureConverter();
        TemperatureConverter toFahrenheit = new TemperatureConverter();


        String name = "value";
        double far = 56.4;
        int cel = 12;

        double Celsius = toCelsius(far);
        double Fahrenheit = toFahrenheit(cel);

        System.out.println(Celsius);
        System.out.println(Fahrenheit);
    }

    public  static double toCelsius(double temp){
        double sum = temp * 0.78;
        return sum;
    }

    public static double toFahrenheit(double temp){
        double sum = temp * 17.56;
        return sum;

    }
}




