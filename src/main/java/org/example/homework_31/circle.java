package org.example.homework_31;

public class circle {

    double radius;
    public static void main(String[] args) {
     circle circle1= new circle (10);
     calculateArea(10);

    }
    public circle (double radius ){
         this.radius = radius ;

}
    public static double calculateArea (double radius1){
        System.out.println(radius1*3.14);
        return radius1*3.14;

    }
}






