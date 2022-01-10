package shapes;
/*
Shapes


Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
 */
public class Rectangle {
    /* FIELDS */
    protected double length;
    protected double width;

    /* CONSTRUCTOR(S) */

    public Rectangle() {
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /* GETTERS/SETTERS */
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /* METHODS */
    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }

}
