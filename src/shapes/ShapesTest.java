package shapes;
/*
Modify your ShapesTest class, use it to:

declare a variable of the type Measurable named myShape.
Test your code by creating instances of both Square and Rectangle and
assigning them to myShape so you can display the shape's area and perimeter.

Answer the following questions:

Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
 */
public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle rec1 = new Rectangle(3, 4);
//        System.out.println(rec1.getArea());
//        System.out.println(rec1.getPerimeter());

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

//        Rectangle box3 = new Square(4);
//        System.out.println(box3.getArea());
//        System.out.println(box3.getPerimeter());


        Measurable myShape = new Rectangle(3, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
