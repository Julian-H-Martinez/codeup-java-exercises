package shapes;
/* Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable. */
public class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (2*width) + (2*length);
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }
}
