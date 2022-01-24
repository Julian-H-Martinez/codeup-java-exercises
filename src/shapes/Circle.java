package shapes;

import util.Input;

public class Circle {

//  FIELDS
    private double radius;

//  CONSTRUCTOR(S)
    public Circle(){
        System.out.println("Creating a circle");
    }
    /* public Circle(double radius) */
    public Circle(double radius){
        this.radius = radius;
    }

//  METHOD(S)
    /* public double getArea() */
    public double getArea(){
        return Math.PI*(Math.pow(this.radius, 2));
    }
    /* public double getCircumference() */
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }



}
