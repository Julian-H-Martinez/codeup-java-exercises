import java.util.Scanner;

public class Warmups {

    /* 1) Create a class named “Penguin” */
    public static class Penguins{
        /* FIELDS */
        /* 2) Give your class the following private fields
            Name
            Weight
            Species
            Sex
        */
        private String name;
        private double weight;
        private String species;
        private String sex;

        /* METHODS */

        /* 3) Give your class the following public methods
            getName
            getWeight
            getSpecies
            getSex
            setName
            setWeight
            setSpecies
            setSex
        */
        /* GETTERS/SETTERS */
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

//        @Override
//        public String toString() {
//            return "Penguins{\n" +
//                    "name='" + name + '\'' +
//                    ", \nweight=" + weight +
//                    ", \nspecies='" + species + '\'' +
//                    ", \nsex='" + sex + '\'' +
//                    '}';
//        }

/* CONSTRUCTOR(S) */
        /* 4) Give your class a constructor method */
        public Penguins(){
            System.out.println("Creating a new Penguin");
        }

        public Penguins(String name, double weight, String species, String sex) {
            this.name = name;
            this.weight = weight;
            this.species = species;
            this.sex = sex;
        }


        /* PUBLIC STATIC METHODS */
        /* 5) Give your class the following public static methods
            canFly (returns false)
            areEvil (returns true) [Source]
         */
        public static boolean canFly(){
            return false;
        }
        public static boolean areEvil(){
            return true;
        }
    }

//    public static String startDay(){
//        return "Brain loading... Done!";
//    }
    public static void main(String[] args){
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");

        //  12.16 Warmup
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("What did you eat for breakfast today?");
//        String userBreakfast = sc.nextLine();
//        System.out.printf("Wow, you ate %s for breakfast? How was the %s", userBreakfast, userBreakfast);

        //  01.04 Warmup
        //  Create a method called “startDay” that returns a string with the value of “Brain loading… Done!”. Execute your program and print the output to the console.
        //  Add, commit, and push your work to GitHub.

//        System.out.println(startDay());
        Penguins bob = new Penguins("bob", 200, "non-flying bird", "male");
        System.out.println(bob.toString());
    }
}
