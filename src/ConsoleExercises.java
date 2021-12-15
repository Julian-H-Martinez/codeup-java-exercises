import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args){
//        System.out.println("Yep I\'m working just fine!");

        /**TODO: Console IO READING*/
//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
        //  per reading we are to explicitly add a newline, why? Because printf does not create a new line therefore needing to \n
        //  System.out.printf("Hello there, %s. Nice to see you.", name);

//        String greeting = "Salutations";
//        System.out.printf("%s, %s \n", greeting, name);
        //  will pass variables in order they are passed/placed

        //  declaring variable of type Scanner
        //  assigning it to a new Scanner OBJECT
        //  specified System.in --> source of the scanner --> referring to info user types into console
//        Scanner scanner = new Scanner(System.in);

        //  prompting user to type something
//        System.out.print("Enter something: ");
        //  obtain value user entered as a String and storing it in var userInput
        //  String userInput = scanner.next();
        //  using .nextLine() will return any remaining input
//        String userInput = scanner.nextLine();

        //  printing out value user entered
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //  token = is each individual entry to scanner
        //  tokens by default are separated by any whitespace
        //  if user enters text with whitespace only first word will print
        //  per reading if we called scanner.next() again it would return rocks! --> question is, where do we call scanner.next() again?

        //  worth noting there are other methods that will return user input
        //  nextInt --> will return user input as an int

        /** 1)  Copy this code into your main method: */
        double pi = 3.14159;
        //  per documentation, a newline should be passed like %n and not \n
//        System.out.printf("The value of pi is approximately %s%n", pi);
//        System.out.printf("The value of pi is approximately %.2f%n", pi);

        /** Scanner 1)
         * Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
         * What happens if you input something that is not an integer? --> Exception error is thrown
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an Integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("User input is: %s", userInput);

        /** Scanner 2)
         Prompt a user to enter 3 words, and store each of them in a separate variable.
         Then, display them back in the console, each on a newline.

         What happens if you enter less than 3 words? --> will not move to printing until 3rd word is entered
         What happens if you enter more than 3 words? --> will only print first 3
         */
//        System.out.print("Enter 3 words");
//        String userStrInput = scanner.next();
//        String userStrInput2 = scanner.next();
//        String userStrInput3 = scanner.next();
//        System.out.printf("%s%n%s%n%s%n", userStrInput, userStrInput2, userStrInput3);

        /** Scanner 3)
         Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
         Then, display that sentence back to the user.

         do you capture all the words? --> only the first word prints out
         */
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
//        System.out.printf("Your sentence is: %n%s", userSentence);

        /** Scanner 4
         Rewrite the above example using the nextLine method.
         */
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.printf("Your sentence is: %n%s", userSentence);





    }
}
