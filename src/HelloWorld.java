public class HelloWorld {
    public static void main(String[] args) {
//Class Lecture
////        System.out.println("Hello");
////        System.out.println("World!");
//
//        byte month = 12;
////        System.out.println(month);
//
//        short daysInYear = 365;
////        System.out.println(daysInYear);
//
////        System.out.println('I');
//
//        //  New line
////        System.out.println("Hello\nWorld!");
//        //  tab
////        System.out.println("Hello\tWorld!");
//        //  backslash
////        System.out.println("Hello\\World!");
//
//        String greeting = "Hello world of JAVA!!!";
//
//        String name;
//        name = "Jay";
////        System.out.println(greeting);
////        System.out.println(name);
//
//        //  need f at end to denote a float
//        float pi = 3.14f;
////        System.out.println(pi);
//
//        //  JAVA we use final which is similar to const in es6
//        final String APIKEY = "dfjkle;qadfujficox;jv5659+692dafe";
//
//        //  APIKEY = "ballaballdfadjfkl;edqafeadfjkdal;fje"  //   unable to set final with new value
//
//        int firstNumber = 20;
//        int secondNumber = 22;
////        System.out.println(firstNumber + secondNumber); //  addition
////        System.out.println(firstNumber / secondNumber); //  division
////        System.out.println(firstNumber * secondNumber); //  multiplication
////        System.out.println(firstNumber % secondNumber); //  modulus
////        System.out.println(firstNumber - secondNumber); //  subtraction
//
//        int postIncrement = 0;
//        postIncrement++;
////        increment++;
//        System.out.println(postIncrement);
//        int decrement = --postIncrement;
//        System.out.println(decrement);
//        decrement--;
//        System.out.println(decrement);
//
//        decrement += 5;
//        System.out.println(decrement);
//
//        //  CASTING
//
//        byte dayOfMonth = 14;
//        byte birthday = 24;
//
//        //  returns the correct output because the result of the expression \by default is an int data type
//        System.out.println(dayOfMonth * birthday);
//        //  cannot assign result to a byte data type, because the result is out of scope.
//        //  byte result = dayOfMonth * birthday;
//
//        //  IMPLICIT CASTING = less specific data type, to a more specific data type
//        int result = dayOfMonth * birthday;
//
//        //  EXPLICIT CASTING = more specific data type, to less specific data type
//        int x = 900;
//        int y = 800;
//
//        //  byte difference = x - y;    //  IMPLICIT
//
//
//        int difference = (byte)(x-y);   //  EXPLICIT
//        System.out.println(difference);

/** 1) Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console. */
        int myFavoriteNumber = 10;
        System.out.println(myFavoriteNumber);

/** 2) Create a String variable named myString and assign a string value to it, then print the variable out to the console.*/
        String myString = "So far so good here in JAVA world!";
        System.out.println(myString);

/** 3) Change your code to assign a character value to myString. What do you notice?*/
//        char myString = "So far so good here in JAVA world!";     //  won't accept it

/** 4) Change your code to assign the value 3.14159 to myString. What happens?*/
//        String myString = 3.14159;    //  it won't accept it

/** 5) Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens? */
//        long myNumber;
//        System.out.println(myNumber);   //  get a red line on myNumber in sout

/** 6) Change your code to assign the value 3.14 to myNumber. What do you notice? */
//        myNumber = 3.14;    //  it's not being accepted; not assignable?

/** 7) Change your code to assign the value 123L (Note the 'L' at the end) to myNumber. */
//        myNumber = 123L;    //  it's accepted and is assignable with 'L' at end

/** 8) Change your code to assign the value 123 to myNumber.
 * Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does? */
//        myNumber = 123;     //  it's accepted now; hmmmm
//  because of the decimal; long and int are both whole numbers*/


/** 9) Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? */
//        float myNumber = 3.14;  //  not accepting
//        float myNumber = 3.14f; //  first way to fix it
//        float myNumber = (float)(3.14);   //  second way to fix it
//        System.out.println(myNumber);

/** 10) Copy and paste the following code blocks one at a time and execute them */
























    }
}
