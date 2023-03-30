package org.example.homework_31;

public class Circle {

    double radius;
    public static void main(String[] args) {
     Circle circle1= new Circle (10);
      calculateArea(circle1.radius);
    }


    public Circle (double radius ){
         this.radius = radius ;

}
    public static double calculateArea (double radius1){
        System.out.println(radius1*3.14);
        return radius1*3.14;

    }
}






