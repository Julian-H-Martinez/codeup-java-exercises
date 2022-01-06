package warmups;

public class Penguin {
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
    /* CONSTRUCTOR(S) */
    /* 4) Give your class a constructor method */
    public Penguin(){
        System.out.println("Creating a new Penguin");
    }

    public Penguin(String name, double weight, String species, String sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "\nname='" + name + '\'' +
                ", \nweight=" + weight +
                ", \nspecies='" + species + '\'' +
                ", \nsex='" + sex + '\'' +
                '}';
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

    public static void main(String[] args) {
        Penguin bob = new Penguin("bob", 200, "non-flying bird", "male");
        System.out.println(bob.toString());
    }
}
