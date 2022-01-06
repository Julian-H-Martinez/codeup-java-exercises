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

//  Circle App
public static class CircleApp{

    public static void main(String[] args) {
        Input user1 = new Input();
        System.out.println("Please enter in radius of circle: ");
        user1.getInt(1,10);
        int userRad = user1.getInt();
        Circle circle1 = new Circle(userRad);
        System.out.println(circle1.getArea());
    }
}

}
