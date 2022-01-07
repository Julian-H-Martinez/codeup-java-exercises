import java.util.Arrays;

public class ArraysExercises {
/*
assist cited: https://www.softwaretestinghelp.com/add-elements-to-array-java/
 */
public static Person[] addPerson(int n, Person peeps[], Person name){
    Person newPeeps[] = new Person [n+1];
    for(int i = 0; i < n; i++){
        newPeeps[i] = peeps[i];
        newPeeps[n] = name;
    }
    return newPeeps;
}


public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers);
//    System.out.println(Arrays.toString(numbers));

//    Person[] peeps = new Person[3];
//    peeps[0] = new Person("Bob");
//    peeps[1] = new Person("Willy");
//    peeps[2] = new Person("Snoop");
    Person[] peeps ={new Person("Bob"), new Person("Willie"), new Person("Hank")};
    for(Person peep : peeps){
        System.out.println(peep.getName());
    }

    Person addedPerson = new Person("Julian");

    Person[] myPeeps = addPerson(peeps.length, peeps, addedPerson);

    for(Person myPeep : myPeeps){
        System.out.println(myPeep.getName());
    }


}
}
