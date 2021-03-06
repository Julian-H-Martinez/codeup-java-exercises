package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

//    CONSTRUCTOR(S)

    public Quadrilateral(){}

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
//  METHODS

    //  GETTERS

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    //  SETTERS
    public abstract void setLength(double length);
    public abstract void setWidth(double width);


//    public Quadrilateral(){}
//
}
