package grades;

import java.util.ArrayList;

public class StudentGradesTest {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Student s1 = new Student("bob", grades);
        System.out.println(s1);
        s1.addGrade(99);
        s1.addGrade(89);
        s1.addGrade(70);
        System.out.println(s1.getGradeAverage());

    }
}
