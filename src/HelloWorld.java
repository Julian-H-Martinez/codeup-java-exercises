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
//        int x = 5;
//        System.out.println("post increment");
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println("pre increment");
//        System.out.println(++y);
//        System.out.println(y);

        //  difference is that post increment won't be seen right away, it'll need to be called on to see change
        //  whereas pre increment you would be able to see the increment upon initial call

/** 11) Try to create a variable named class. What happens? */
//        String class = "greeting";
//  not accepted because class can't be used as a variable name because it's a reserved word

/** 12) Object is the most generic type in Java. You can assign any value to a variable of type Object.
 *      What do you think will happen when the following code is run? */
//  it'll be accepted, maybe, hmmm
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//  Exception in thread "main" java.lang is thrown;
//        int three = (int) "three";  //  won't be accepted because both need to be in ()
//  java:incompatible types: java.lang.String cannot be converted to int

/** 13) Rewrite the following expressions using the relevant shorthand assignment operators: */
/**
        int x = 4;
        x = x + 5;
 */
//        int x = 4;
//        x += 5;
//        System.out.println(x);
/**
     int x = 3;
     int y = 4;
     y = y * x;
 */
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);
/**
     int x = 10;
     int y = 2;
     x = x / y;
     y = y - x;
 */
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);
/** 14)
 * What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
 * it won't be accepted; red line will be thrown
 * What happens if you increment a numeric variable past the type's capacity?
 * it'll return a negative number
 * Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type. */



















    }
}
