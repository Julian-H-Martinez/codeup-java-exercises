import java.util.Scanner;

public class Warmups {
    public static void main(String[] args){
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");

        //  12.16 Warmup
        Scanner sc = new Scanner(System.in);

        System.out.print("What did you eat for breakfast today?");
        String userBreakfast = sc.nextLine();
        System.out.printf("Wow, you ate %s for breakfast? How was the %s", userBreakfast, userBreakfast);
    }
}
