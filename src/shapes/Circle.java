package shapes;

public class Circle {
    /*
    Circle class

    Inside of src, create a package named shapes. Inside of shapes, create a class named Circle.
    This class should have a private radius field that is set through the constructor, and various methods for getting information about the circle, detailed below.

    public Circle(double radius)
    public double getArea()
    public double getCircumference()
    Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)

    The formulas for the circumference and area:

    circumference = 2 x pi x radius
    area = pi x (radius ^ 2)
    For the value of pi, use the PI constant of the Math class.
     */

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


//  Testing
//    public static class CircleTest{
//        public static void main(String[] args){
//            Circle circle1 = new Circle(3);
//            System.out.println("The area of circle is: " + circle1.getArea());
//            System.out.println("The circumference of circle is: " + circle1.getCircumference());
//        }
//    }
}
