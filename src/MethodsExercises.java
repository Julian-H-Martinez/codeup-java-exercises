import java.util.Locale;
import java.util.Scanner;

public class MethodsExercises {

    public static Scanner sc = new Scanner(System.in);

    /*
    Problem 1
     */
    public static int addition(int num, int num2) {
        return num + num2;
    }

    public static int subtraction(int num, int num2) {
        return num - num2;
    }

    public static int multiplication(int num, int num2) {
        int total = 0;
        int i = 1;
        do {
            total += num;
            i++;
        } while (i <= num2);
        return total;
    }

    //    public static int multiplication(int num, int num2){
//        int total = 0;
//            total += num;
//        return multiplication(total, num2);
//    }
    public static int division(int num, int num2) {
        return num / num2;
    }

    public static int remainder(int num, int num2) {
        return num % num2;
    }


    /*
    Problem 2
    */
    public static long getInteger(int min, int max) {
        System.out.println("Pick a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if (userInput < min) {
            System.out.println("You chose " + userInput + "\nThat's below the range");
        } else if (userInput > max) {
            System.out.println("You chose " + userInput + "\nThat's above the range");
        } else {
//            System.out.println("You chose " + userInput);
            return userInput;
        }
        return getInteger(min, max);
    }

    /*
    Problem 3
    Assistance Cited: https://www.javatpoint.com/factorial-program-in-java

    still need to work on this one; it's completed but needs to be clean.
     */
    static long factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            long result = num * factorial(num - 1);
            System.out.println(num + "! = " + result);
            return result;
        }
    }

    public static long getInteger(int min, int max, int userNum) {
        System.out.println("Pick an integer between 1 and 39: ");
        userNum = sc.nextInt();
        factorial(userNum);
        System.out.println("Would you like to continue? [Y/N]");
        String userContinue = sc.next().toLowerCase(Locale.ROOT);
        if (userContinue.equals("y")) {
            System.out.println("Pick an integer between 1 and 39: ");
            userNum = sc.nextInt();
            factorial(userNum);
        } else {
            System.out.println("Maybe next time.");
        }
        return userNum;
    }

//    public static long getFactorial(int min, int max){
//        System.out.println("Pick an integer between 1 and 39: ");
//        int userNum = sc.nextInt();
//        System.out.println("Would you like to continue? [Y/N]");
//        String userContinue = sc.next().toLowerCase(Locale.ROOT);
//        if(userContinue.equals("y")){
//            if(userNum < min){
//                System.out.println("You chose " + userNum + "\nThat's below the range");
//            }else if(userNum > max){
//                System.out.println("You chose " + userNum + "\nThat's above the range");
//            }else{
//                System.out.println(factorial(userNum));
//                return factorial(userNum);
//            }
//        }else{
//            System.out.println("Maybe next time.");
//        }
//        return userNum;
//    }

    /*
    Create an application that simulates dice rolling.

    Ask the user to enter the number of sides for a pair of dice.
    System.out.println("How many sides does your pair of dice have?");
    Prompt the user to roll the dice.
    System.out.println("Roll the dice...[ENTER]");
    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    Use static methods to implement the method(s) that generate the random numbers.
    Use the .random method of the java.lang.Math class to generate random numbers.
     */
//    static int randomDice1(int num){
//        return num;
//    }


    /*
    Game Development 101

    Welcome to the world of game development!

    You are going to build a high-low guessing game. Create a class named HighLow inside of src.

    The specs for the game are:

    Game picks a random number between 1 and 100.
    Prompts user to guess the number.
    All user inputs are validated.
    If user's guess is less than the number, it outputs "HIGHER".
    If user's guess is more than the number, it outputs "LOWER".
    If a user guesses the number, the game should declare "GOOD GUESS!"
    Hints

    Use the random method of the java.lang.Math class to generate a random number.
     */
    public static int randomNum = (int) Math.floor((Math.random() * 25) + 1);

    public static void highLow() {
//        System.out.println(randomNum);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Guess what number I'm thinking of: ");
        int userSelect = sc.nextInt();
        if (userSelect > randomNum) {
            System.out.println("LOWER");
            highLow();
        } else if (userSelect < randomNum) {
            System.out.println("HIGHER");
            highLow();
        } else {
            System.out.println("GOOD GUESS!");
        }
    }

    public static void main(String[] args) {
//        System.out.println("Yep I work");
//        System.out.println(addition(4, 5));               //  should be 9
//        System.out.println(subtraction(10, 3));           //  should be 7
//        System.out.println(multiplication(3, 4));         //  should be 12
//        System.out.println(division(23, 5));              //  should be 4
//        System.out.println(division(23, 0));              //  anything divided by 0 is undefined causing a runtime error
//        System.out.println(remainder(23, 5));             //  should be 3
//        getInteger(1, 10);
//        getFactorial(1, 39);
//        System.out.println(factorial(5));
//        factorial(5);
//        getInteger(1, 39, 1);
        highLow();

    }
}
