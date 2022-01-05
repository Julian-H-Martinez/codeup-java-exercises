package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private String userString;
    private int userInt;
    private double userDouble;

//  CONSTRUCTOR(S)

    public Input(){
        this.scanner = new Scanner(System.in).useDelimiter("\n");
//        this.userInt = scanner.nextInt();
    }

//  METHOD(S)
    public String getString(){
        System.out.println("Enter a string: ");
        this.userString = scanner.nextLine();

        System.out.println(userString);
        return this.userString;
    }

    /*The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.*/
    public boolean yesNo(){
        System.out.println("You are a sports fan. [YES/NO]");
        this.userString = scanner.nextLine();
        if(userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d-%d: ", min, max);
        this.userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
            return getInt(min, max);
        }else{
            return userInt;
        }
    }

    public int getInt(){
        return userInt;
    }

    public double getDouble(int min, int max){
        System.out.printf("Enter a decimal between %d - %d: ", min, max);
        this.userDouble = scanner.nextDouble();
        if(userDouble <= min || userDouble >= max){
            return getDouble(min, max);
        }else{
            return userDouble;
        }
    }

    public double getDouble(){
        return userDouble;
    }

public static class InputTest{
    public static void main(String[] args) {

        Input user1 = new Input();
//        System.out.println(user1.getString());
//        String confirm = user1.getString();
//        System.out.println(user1.yesNo());
//        user1.getInt(3, 10);
//        System.out.println(user1.getInt());
//        user1.getDouble(0, 1);
//        System.out.println(user1.getDouble());
    }
}
}
