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
        this.userString = scanner.nextLine();

        System.out.println(userString);
        return this.userString;
    }

    /*BONUS: added String parameter to message user first*/
    public String getString(String prompt){
        System.out.println(prompt);
        this.userString = scanner.nextLine();

        System.out.println(userString);
        return this.userString;
    }

    /*The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.*/
    public boolean yesNo(){
        this.userString = scanner.nextLine();
        if(userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max){
        this.userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
            System.out.printf("Number should be between %d-%d: ", min, max);
            return getInt(min, max);
        }else{
            return userInt;
        }
    }

    /*BONUS: added String parameter to message user first*/
    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        this.userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
            System.out.printf("Number should be between %d-%d: ", min, max);
            return getInt(min, max);
        }else{
            return userInt;
        }
    }

    public int getInt(){
        return userInt;
    }

    public double getDouble(int min, int max){
        this.userDouble = scanner.nextDouble();
        if(userDouble <= min || userDouble >= max){
            System.out.printf("Enter a decimal between %d - %d: ", min, max);
            return getDouble(min, max);
        }else{
            return userDouble;
        }
    }

    /*BONUS: added String parameter to message user first*/
    public double getDouble(int min, int max, String prompt){
        System.out.println(prompt);
        this.userDouble = scanner.nextDouble();
        if(userDouble <= min || userDouble >= max){
            System.out.printf("Enter a decimal between %d - %d: ", min, max);
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
//        System.out.println(user1.getInt());
//        System.out.println("Enter a string: ");
//        System.out.println(user1.getString());
//        user1.getString("What's your favorite quote? ");
//        String confirm = user1.getString();
//        System.out.println("You are a sports fan. [YES/NO]");
//        System.out.println(user1.yesNo());
//        System.out.println("Enter a number: " );
//        user1.getInt(3, 10, "Enter a number: ");
//        System.out.println(user1.getInt());
//        System.out.println("Enter a decimal : ");
//        user1.getDouble(0, 1);
//        System.out.println(user1.getDouble());
    }
}
}
