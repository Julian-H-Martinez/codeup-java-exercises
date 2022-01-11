package grades;
/*
Create a map for students and GitHub usernames

Inside the main method, create a HashMap named students.
It should have keys that are strings that represent github usernames, and values that are Student objects.
Create at least 4 Student objects with at least 3 grades each, and add them to the map.

Be creative! Make up GitHub usernames and grades for your student objects.
 */

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

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

        System.out.println(students);
    }
}
