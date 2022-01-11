package grades;

import java.util.ArrayList;

/*


The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
The Student class should have the following methods:


// returns the average of the students grades
// public double getGradeAverage();
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

    public Student(String studentName, ArrayList<Integer> grades) {
        this.name = studentName;
        this.grades = new ArrayList<>();
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
        for(int i = 0; i <= grades.size(); i++){
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

}
