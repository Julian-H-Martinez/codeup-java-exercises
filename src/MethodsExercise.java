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
//        for (int i = 1; i <= num2; i++){
//            total += num;
//        }
        return total;
    }
    public static int division(int num, int num2){
        return num/num2;
    }
    public static int remainder(int num, int num2){
        return num % num2;
    }
    public static void main(String[] args) {
//        System.out.println("Yep I work");
//        System.out.println(addition(4, 5));             //  should be 9
//        System.out.println(subtraction(10, 3));         //  should be 7
        System.out.println(multiplication(3, 4));     //  should be 420
//        System.out.println(division(23, 5));            //  should be 4
//        System.out.println(division(23, 0));            //  anything divided by 0 is undefined causing a runtime error
//        System.out.println(remainder(23, 5));           //  should be 3

    }
}
/*
Bonus

Create your multiplication method without the * operator (Hint: a loop might be helpful).
Do the above with recursion.
 */