package shapes;
/* Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable. */
public class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }

    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (2*this.width) + (2*this.length);
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }
}
