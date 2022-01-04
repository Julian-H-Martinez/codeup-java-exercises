import java.util.Scanner;

public class MethodsExercise {

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
    public static void main(String[] args) {
//        System.out.println("Yep I work");
//        System.out.println(addition(4, 5));               //  should be 9
//        System.out.println(subtraction(10, 3));           //  should be 7
//        System.out.println(multiplication(3, 4));         //  should be 420
//        System.out.println(division(23, 5));              //  should be 4
//        System.out.println(division(23, 0));              //  anything divided by 0 is undefined causing a runtime error
//        System.out.println(remainder(23, 5));             //  should be 3
        getInteger(1, 10);

    }
}
/*
Bonus
Create your multiplication method without the * operator (Hint: a loop might be helpful).
Do the above with recursion.
 */