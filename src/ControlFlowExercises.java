import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        /** 1) Loop Basics */
        //  While Loop
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while(i <= 15){
//            System.out.printf("%d ", i);
//            i++;
//        }
        //  Do While
        //
        //  Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do{
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }while(i <= 100);
        //  Alter your loop to count backwards by 5's from 100 to -10.
//        int y = 100;
//        do{
//            if(y % 5 == 0){
//                System.out.println(y);
//            }
//            y--;
//        }while(y >= -10);
        //  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        long x = 2;
//        do{
//            System.out.println(x);
//            x *= x;
//        }while(x < 1000000);
        //  Output should equal:
        //  2
        //  4
        //  16
        //  256
        //  65536

        //  For
        //
        //  Refactor the previous two exercises to use a for loop instead.

        //  Create a loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        for (int i = 0; i <= 100; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }
        //  Alter your loop to count backwards by 5's from 100 to -10.
//        for (int y = 100; y >= -10; y--){
//            if(y % 5 == 0){
//                System.out.println(y);
//            }
//        }
        //  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
        //  Output should equal:
        //  2
        //  4
        //  16
        //  256
        //  65536
//        for (long x = 2; x < 1000000; x *= x){
//            System.out.println(x);
//        }

        /** 2) FIZZBUZZ */
        //  One of the most common interview questions for entry-level programmers is the FizzBuzz test.
        //  Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for(int i = 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }
        //  do while loop for practice
//        int x = 1;
//        do{
//            if(x % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(x % 3 == 0){
//                System.out.println("Fizz");
//            }else if(x % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(x);
//            }
//            x++;
//        }while(x <= 100);

        /** 3) Display a table of powers. */
        Scanner sc = new Scanner(System.in);
//        sc.useDelimiter("%n");
        //  Prompt the user to enter an integer.
//        System.out.print("What number would you like to go up to? ");
//        int userInput = sc.nextInt();
//        System.out.print("Would you like to continue? [Y/N]");
//        String userChoice = sc.next();
        //  Display a table of squares and cubes from 1 to the value entered.
        //  Ask if the user wants to continue.
        //  Assume that the user will enter valid data.
        //  Only continue if the user agrees to.
        //  Example Output
        //
        //
        //  What number would you like to go up to? 5
        //
        //  Here is your table!
        //
        //  number | squared | cubed
        //  ------ | ------- | -----
        //  1      | 1       | 1
        //  2      | 4       | 8
        //  3      | 9       | 27
        //  4      | 16      | 64
        //  5      | 25      | 125

//        if(userChoice.equalsIgnoreCase("y")){
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed ");
//            System.out.println("------ | ------- | ----- ");
//
//            for(int x = 1; x <= userInput; x++){
//                int num = x;
//                int sq = x * x;
//                int cube = x * x * x;
//                System.out.printf("%-6d | %-7d | %-6d %n", num, sq, cube);
//            }
//        }else{
//            System.out.println("Sorry to hear that, maybe next time!");
//        }

        /** 4) Convert given number grades into letter grades. */
        //  Prompt the user for a numerical grade from 0 to 100.
            //  Display the corresponding letter grade.
            //  Prompt the user to continue.
            //  Assume that the user will enter valid integers for the grades.
            //  The application should only continue if the user agrees to.
            //  Grade Ranges:
            //
                //  A : 100 - 88
                //  B : 87 - 80
                //  C : 79 - 67
                //  D : 66 - 60
                //  F : 59 - 0

        System.out.print("Enter your numerical (1-100) grade: ");
        int userGrade = sc.nextInt();
        System.out.print("Would you like to continue? [Y/N]");
        String userChoice = sc.next();

        if(userChoice.equalsIgnoreCase("y")){
            if(userGrade > 87 && userGrade < 101){
                if(userGrade == 99 || userGrade == 100){
                    System.out.println("Very NICE!!! You got an A+!!!");
                }else{
                    System.out.println("Nice your grade is an A!");
                }
            }else if(userGrade > 79 && userGrade < 88){
                if(userGrade == 87){
                    System.out.println("Almost there, nice B+!");
                }else{
                    System.out.println("Your grade is a B!");
                }
            }else if(userGrade > 66 && userGrade < 80){
                if(userGrade == 66 || userGrade == 67){
                    System.out.println("You're right there, good job on the C+!");
                }else{
                    System.out.println("You got a C");
                }
            }else if(userGrade > 59 && userGrade < 67){
                System.out.println("You got a D");
            }else if(userGrade > -1 && userGrade < 60){
                System.out.println("F!");
            }else{
                System.err.println("Ummm let's not be silly here! Enter a valid whole number grade.");
            }
        }else{
            System.err.println("Completely understand, wouldn't want to continue with that grade either! LOL!!!");
        }

    }
}
