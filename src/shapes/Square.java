package shapes;
/*
In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
perimeter = 4 x side
area = side ^ 2

 */
public class Square extends Rectangle{
    protected double side;
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }

    public Square(){
        System.out.println("Creating a square");
    }
    public Square(double side){
        super(side, side);
    }

    public double getArea(){
//        super.getArea();
        System.out.println("I'm overriding: " + Math.pow(this.side, 2));
        return Math.pow(this.side, 2);
    }

    public double getPerimeter(){
        super.getPerimeter();
        return Math.pow(side, 2);
    }


}
