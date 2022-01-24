package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input user1 = new Input();
        System.out.println("Please enter in radius of circle: ");
        user1.getInt(1, 10);
        int userRad = user1.getInt();
        Circle circle1 = new Circle(userRad);
        System.out.println(circle1.getArea());
    }
}