import java.util.Scanner;

public class HighLow {
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
        highLow();
    }
}
