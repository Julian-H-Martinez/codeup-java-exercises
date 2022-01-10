package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle rec1 = new Rectangle(3, 4);
//        System.out.println(rec1.getArea());
//        System.out.println(rec1.getPerimeter());

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());

        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
        box2.getArea();
        System.out.println("I'm sout: " + box2.getPerimeter());

        Rectangle box3 = new Square(4);
//        System.out.println(box3.getArea());
        box3.getArea();
        System.out.println("I'm sout: " + box3.getPerimeter());
    }
}
