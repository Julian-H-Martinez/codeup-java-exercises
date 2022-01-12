package grades;

import java.util.ArrayList;

/*
Test your Student class by adding a main method and creating Student objects.
Verify that you can add grades to each object, and
that your getGradeAverage method correctly returns the average of the student's grades.
 */
public class Student {
    //  FIELDS  //
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    //  CONSTRUCTORS    //

    public Student() {
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String studentName, ArrayList<Integer> grades) {
        this.name = studentName;
        this.grades = grades;
    }

    //  METHODS //
    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    // public void addGrade(int grade);
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    // public double getGradeAverage();
    public double getGradeAverage(){
        double sum = 0;
        for(int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        return sum/grades.size();

    }
    public void sumOfGrades(ArrayList<Integer> grades){
        double sum = 0;
        for (int i = 0; i <= grades.size(); i++){
            sum += grades.get(i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> grades2 = new ArrayList<>();
        ArrayList<Integer> grades3 = new ArrayList<>();
        Student s1 = new Student("bob", grades);
        s1.addGrade(99);
        s1.addGrade(89);
        s1.addGrade(70);
        System.out.printf("%n%s average is %.2f", s1.getName(), s1.getGradeAverage());
        System.out.println(s1.grades);
    }


}
