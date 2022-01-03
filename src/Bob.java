import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
//        System.out.println("Yep I work!");
        /**
         * Create a class named Bob with a main method for the following exercise.
         *
         * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
         *
         * Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
         * He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
         * He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
         * He answers 'Whatever.' to anything else.
         * Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Start a conversation with Bob. What would you like to ask/tell Bob?");
        String userResponse1 = sc.nextLine();
        //  Bob's responses
        if(userResponse1.contains("?")){
            System.out.println("Sure.");
            System.out.println("What about you?");
            String userResponse2 = sc.nextLine();
            if(userResponse2.contains("?")){
                System.out.println("Sure");
            }else if(userResponse2.contains("!")){
                System.out.println("Whoa, chill out!");
            }else if(userResponse2.equals("")){
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever.");
            }
        }else if(userResponse1.contains("!")){
            System.out.println("Whoa, chill out!");
            System.out.println("Why are you so excited?");
            String userResponse3 = sc.nextLine();
            if(userResponse3.contains(".")){
                System.out.println("That's cool just simmer down.");
            }
        }else if(userResponse1.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever.");
        }
    }
}
