package movies;

import util.Input;

/*
Movie List

Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)

If a category is selected, only movies from that category should be displayed.

Your application should continue to run until the user chooses to exit.

Sample Output:
What would you like to do?

0 - exit
1 - view all movies
2 - view movies in the animated category
3 - view movies in the drama category
4 - view movies in the horror category
5 - view movies in the scifi category

Enter your choice: 1

Frankenstein -- horror
Goodfellas -- drama
Pulp Fiction -- drama
...
 */


public class MoviesApplication {

    public static void movieView(){
        Input user1 = new Input();
//        System.out.println("\nEnter your choice: ");
        Movie[] allMovies;
        do{
            int choice = user1.getInt(0, 5, "\nEnter your choice: ");
            switch (choice){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("View all movies");

                    break;
                case 2:
                    System.out.println("Animated Category");
                    break;
                case 3:
                    System.out.println("Drama Category");
                    break;
                case 4:
                    System.out.println("Horror Category");
                    break;
                case 5:
                    System.out.println("Scifi Category");
                default:
                    System.out.println("Out of range!");
                    user1.getInt(0, 5, "Choose between 0-5");
            }
            user1.yesNo("Would you like to view another category?");
        }while(user1.yesNo());

    }


    public static void main(String[] args) {
//        System.out.println("Yep I'm working!");
        System.out.println("What would you like to do?");
        System.out.println("\n0 - exit" +
                "\n1 - view all movies" +
                "\n2 - view movies in the animated category" +
                "\n3 - view movies in the drama category" +
                "\n4 - view movies in the horror category" +
                "\n5 - view movies in the scifi category");
//        System.out.println("\nEnter your choice: ");
        movieView();
    }
}
