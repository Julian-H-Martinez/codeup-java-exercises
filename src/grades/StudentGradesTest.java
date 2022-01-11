package grades;

import java.util.ArrayList;

public class StudentGradesTest {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> grades2 = new ArrayList<>();
        ArrayList<Integer> grades3 = new ArrayList<>();
        Student s1 = new Student("bob", grades);
        Student s2 = new Student("willie", grades2);
        Student s3 = new Student("hank", grades3);
        s1.addGrade(99);
        s1.addGrade(89);
        s1.addGrade(70);
        //  Student 2 Willie
        s2.addGrade(100);
        s2.addGrade(76);
        s2.addGrade(91);
        //  Student 3 Hank
        s3.addGrade(92);
        s3.addGrade(74);
        s3.addGrade(83);
        System.out.printf("%n%s average is %.2f", s1.getName(), s1.getGradeAverage());
        System.out.printf("%n%s average is %.2f", s2.getName(), s2.getGradeAverage());
        System.out.printf("%n%s average is %.2f", s3.getName(), s3.getGradeAverage());

    }
}
