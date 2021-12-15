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

        //  Instantiating a SCANNER OBJECT
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
        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("Your sentence is: %n%s%n", userSentence);


        /** Calculate the perimeter and area of Codeup's classrooms. */
        /**
         * 1) Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
         * Use the nextLine method each time you need to get user input.
         * In this case, we need it twice, once to get the user input for the length and again to get the user input for the width.
         * Parse the resulting strings to a numeric type.
         * Assume that the rooms are perfect rectangles.
         * Assume that the user will enter valid numeric data for length and width.
        */
////        // Declarations
////
//        Scanner in = new Scanner(System.in);
//        in.useDelimiter("\n");
//        int length;
//        int width;
//        int area;
//        int perimeter;
////
////        // Prompts
////
//        System.out.println("Enter length and width of a room: ");
////
////        // Read in values
////
//        length = in.nextInt();
//        width = in.nextInt();
////
//        System.out.println("Here is what you entered: ");
//        System.out.printf(" Length: %d%n Width: %d%n ", length, width);
////
////        /**
////        * 2) Display the area and perimeter of that classroom.
////        * The area of a rectangle is equal to the length times the width,
////        * and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
////         */
////        area = length * width;
////        perimeter = (length * 2) + (width * 2);
////        System.out.printf("Area: %d%n Perimeter: %d%n", area, perimeter);

        /** BONUS BONUS BONUS
         *  In your perimeter/area calculator:
               - Accept decimal entries.
               - Calculate the volume of the rooms in addition to the area and perimeter.

         *  The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method.
         *  Add the following line of code to your application after you have created a scanner
              (assuming the variable holding the Scanner is named scanner): scanner.useDelimiter("\n");
         *  How does this change the way your program operates?
         *  Rewrite your classroom program to use nextInt method.
         *  If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.*/

//        // Declarations
//
        Scanner in = new Scanner(System.in);
//        in.useDelimiter("\n");
        float length;
        float width;
        float height;
        float area;
        float perimeter;
        float volume;
//
//        // Prompts
//
        System.out.println("Enter length, width, and height of a room: ");
//
//        // Read in values
//

        length = in.nextFloat();
        width = in.nextFloat();
        height = in.nextFloat();
//
        System.out.println("Here is what you entered: ");
        System.out.printf(" Length: %.2f%n Width: %.2f%n Height: %.2f%n", length, width, height);
//
//        /**
//        * 2) Display the area and perimeter of that classroom.
//        * The area of a rectangle is equal to the length times the width,
//        * and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//         */
        area = length * width;
        perimeter = (length * 2) + (width * 2);
        volume = area * height;
        System.out.printf(" Area: %.2f%n Perimeter: %.2f%n Volume: %.2f%n", area, perimeter, volume);






    }
}
