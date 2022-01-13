package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input studentSelect = new Input();

        Student s1 = new Student("willie");
        Student s2 = new Student("hank");
        Student s3 = new Student("bob");
        Student s4 = new Student("bruce");

        //  Student 2 Willie
        s1.addGrade(100);
        s1.addGrade(76);
        s1.addGrade(91);
        //  Student 3 Hank
        s2.addGrade(92);
        s2.addGrade(74);
        s2.addGrade(83);
        //  Student 3 Bob
        s3.addGrade(88);
        s3.addGrade(74);
        s3.addGrade(85);
        //  Student 3 Bruce
        s4.addGrade(95);
        s4.addGrade(85);
        s4.addGrade(83);

        //  .put(key, value) - establishes key/value pair
        students.put(s1.getName(), s1);
        students.put(s2.getName(), s2);
        students.put(s3.getName(), s3);
        students.put(s4.getName(), s4);

        //  Print the list of GitHub usernames out to the console
        //  .keySet() provides just the keys of your HashMap
        System.out.println(students.keySet());

        //  ask the user which student they would like to see more information about.
        //  wrapping in a do/while loop
        /*
        do{
            System.out.println("Which student would you like to see info on?");
            String selected = studentSelect.getString("Enter name of student you would like more info on.");
            if(students.containsKey(selected)){
                System.out.println("Username: " + students.get(selected).getName()
                students.get(selected).getGrades()
            }
        }while();
         */
        System.out.println("Which student would you like to see info on?");
        String selected = studentSelect.getString("Enter name of student you would like more info on.");

        if(students.containsKey(selected)){
            System.out.println("You've selected to see user: " + students.get(selected).getName());
            System.out.println(students.get(selected).getName());
            System.out.println(students.get(selected).getGrades());
            if(studentSelect.yesNo("Would you like to view another student?")){
                System.out.println("You've selected to see user: " + students.get(selected).getName());
                System.out.println(students.get(selected).getName());
                System.out.println(students.get(selected).getGrades());
            }
        }else{
            System.out.println("Sorry but no users with that spelling was found");
            studentSelect.yesNo("Would you like to view another student?");

        }


    }
}
/*
Create the command line interface

The user should enter a GitHub username (i.e. one of the keys in your map).
If the given input does not match up with a key in your map, tell the user that no users with that username were found.
If the given username does exist, display information about that student, including their name and their grades.

After the information is displayed, the application should ask the user if they want to continue, and
keep running so long as the answer is yes.


 */