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
        int i = 0;
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }while(i <= 100);
        //  Alter your loop to count backwards by 5's from 100 to -10.
        int y = 100;
        do{
            if(y % 5 == 0){
                System.out.println(i);
            }
            y--;
        }while(y >= -10);
        //  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
        long x = 2;
        do{
            System.out.println(x);
            x *= x;
        }while(x < 1000000);
        //  Output should equal:
        //  2
        //  4
        //  16
        //  256
        //  65536

    }
}
