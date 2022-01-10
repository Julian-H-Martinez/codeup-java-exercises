package shapes;
/*
Change your existing Square class to extend Quadrilateral.
Because the length of all sides of a square are the same,
the methods for setting the length and the width should set both protected properties.
*/
public class Square extends Quadrilateral{
    private double side;

    public Square(double side) {
        this.length = side;
        this.width = side;
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
        this.side = side;
    }
}
