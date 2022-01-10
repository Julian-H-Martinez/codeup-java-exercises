package shapes;
/*
Change your existing Square class to extend Quadrilateral.
Because the length of all sides of a square are the same,
the methods for setting the length and the width should set both protected properties.
*/
public class Square extends Quadrilateral{
    @Override
    public double getPerimeter() {
        return (2*this.length)+(2*this.width);
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    protected double setLength() {
        return 0;
    }

    @Override
    protected double setWidth() {
        return 0;
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
}
