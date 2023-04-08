package org.example.homework_5;

import javax.sound.midi.Soundbank;

public class HomeWork5 {


    public static void main(String[] args) {

        for (Month month: Month.values()){
             System.out.println(month);

        }

        String str = "true";
            boolean b = Boolean.parseBoolean(str);
            System.out.println(b);


        String string = "120";
              byte b1 = Byte.parseByte(string);
             System.out.println(b1);

        string = "32000";
             short b2 = Short.parseShort(string);
             System.out.println(string);

             String s = "147895632";
                 int i = Integer.parseInt(s);
                  System.out.println(s);

        String S = "987654321987654321";
        long l = Long.parseLong(S);
        System.out.println(l);

        String s2= "4444.5d";
        Double d = Double.parseDouble(s2);
        System.out.println(d);

        String d1 = "2354.56f";
        float f = Float.parseFloat(d1);
        System.out.println(f);



        System.out.println(Weekday.SUNDAY.isWeekDay());
        System.out.println(Weekday.SUNDAY.isHoliday());

    }



}





