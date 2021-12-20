import java.util.Scanner;

public class ExtraExercises {
    public static void main(String[] args){
        System.out.println("yep yep I'm working!");

        /** CONTROL STRUCTURES AND LOOPS */

        //  Write a program in Java to read 10 numbers from keyboard and find their sum and average
        //
        //  Expected Output :
        //  The sum of 10 numbers is : 55
        //  The Average is : 5.500000

//        int i = 1;
//        float sum = 0;
//        while(i <= 10){
//            sum = sum + i;
//            i++;
//        }
//        System.out.printf("The sum of 10 numbers is: %f%nThe Average is: %f%n", sum, (sum/10));

        //  Write a program in Java to display the cube of the number upto given an integer.
        //  Read the number using the Scanner class.
        //
        //  Expected Output :
            //  Number is : 1 and cube of the 1 is :1
            //  Number is : 2 and cube of the 2 is :8
            //  Number is : 3 and cube of the 3 is :27
            //  Number is : 4 and cube of the 4 is :64
            //  Number is : 5 and cube of the 5 is :125
        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to cube up to?");
//        int numSelected = sc.nextInt();
//        int x = 1;
//        while(x <= numSelected){
//            int num = x;
//            int cube = x * x * x;
//            System.out.printf("Number is: %d and cube of %d is: %d%n", num, num, cube);
//            x++;
//        }

        //  Write a program in Java to display the n terms of odd natural number and their sum.
        //  Read the odd number using the Scanner class
        //
        //  Test Data
        //  Input number of terms : 10
        //  Expected Output :
        //  The odd numbers are :1 3 5 7 9 11 13 15 17 19
        //  The Sum of odd Natural Number upto 10 terms : 100

//        System.out.println("Enter a number for terms: ");
//        int numChoice = sc.nextInt();
//        System.out.print("The odd numbers are:");
//        for(int x = 1; x <= numChoice*2; x++){
//            if(x % 2 == 0){
//                continue;
//            }else{
//                System.out.print(x + " ");
//            }
//        }
        //  Write a program in Java to display the pattern like right angle triangle with a number.
        //  Read the number using the Scanner class.
        //
        //  The pattern like :
            //  1
            //  12
            //  123
            //  1234
//        System.out.println("How many rows: ");
//        int numRows = sc.nextInt();
//        for(int y = 1; y <= numRows; y++){
//            for(int z = 1; z <= y; z++){
//                System.out.print(z + " ");
//            }
//            System.out.println();
//        }

        //  Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
        //
        //  With an input of 10.
        //  The pattern must look like :
            //  1
            //  2 3
            //  4 5 6
            //  7 8 9 10
        //  Floyd's Triangle cited: https://www.programiz.com/java-programming/examples/pyramid-pattern
        int rows = 4; int number = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(number + " ");
                ++number;
            }
            System.out.println();
        }
    }
}
