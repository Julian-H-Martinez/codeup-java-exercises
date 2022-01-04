import java.util.Locale;
import java.util.Scanner;

public class MethodsExercise {

    /*
    Problem 1
     */
    public static int addition(int num, int num2){
        return num + num2;
    }
    public static int subtraction(int num, int num2){
        return num - num2;
    }
    public static int multiplication(int num, int num2){
        int total = 0;
        int i = 1;
        do{
            total += num;
            i++;
        }while(i <= num2);
        return total;
    }
//    public static int multiplication(int num, int num2){
//        int total = 0;
//            total += num;
//        return multiplication(total, num2);
//    }
    public static int division(int num, int num2){
        return num/num2;
    }
    public static int remainder(int num, int num2){
        return num % num2;
    }


    /*
    Problem 2
    Create a method that validates that user input is in a certain range

    The method signature should look like this:

    public static int getInteger(int min, int max);
    and is used like this:

    System.out.print("Enter a number between 1 and 10: ");
    int userInput = getInteger(1, 10);
    If the input is invalid, prompt the user again.

    Hint: recursion might be helpful here!
    */
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if(userInput < min){
            System.out.println("You chose " + userInput + "\nThat's below the range");
        }else if(userInput > max){
            System.out.println("You chose " + userInput + "\nThat's above the range");
        }else{
            System.out.println("You chose " + userInput);
            return userInput;
        }
        return getInteger(min, max);
    }
    /*
    Problem 3
    Assistance Cited: https://www.javatpoint.com/factorial-program-in-java
     */
    static long factorial(int num){
        if(num == 0){
            return 1;
        }else{
            return (num * factorial(num-1));
        }
    }
    public static long getFactorial(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick an integer between 1 and 39: ");
        int userNum = sc.nextInt();
        System.out.println("Would you like to continue? [Y/N]");
        String userContinue = sc.next().toLowerCase(Locale.ROOT);
        if(userContinue.equals("y")){
            if(userNum < min){
                System.out.println("You chose " + userNum + "\nThat's below the range");
            }else if(userNum > max){
                System.out.println("You chose " + userNum + "\nThat's above the range");
            }else{
                System.out.println(factorial(userNum));
                return factorial(userNum);
            }
        }else{
            System.out.println("Maybe next time.");
        }
            return userNum;
    }

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

    }
}
