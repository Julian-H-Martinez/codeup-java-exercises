public class Person {

    private String name;
//  CONSTRUCTOR(S)
    public Person(){
        System.out.println("A person is being created.");
    }
    public Person(String name){
        this.name = name;
    }

//  METHODS TO FOLLOW
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, how are you today %s", name);
    }

    public static void main(String[] args){
//        System.out.println("Yep I'm working!");
//        Person julian = new Person();
//        System.out.println(julian);
//        julian.setName("Julian");
//        System.out.println(julian.name);
//        julian.sayHello();

        //  UNDERSTANDING REFERENCES

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));    //  true
//        System.out.println(person1 == person2);                             //  false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);         //  true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());          //  John
//        System.out.println(person2.getName());          //  John
//        person2.setName("Jane");
//        System.out.println(person1.getName());          //  John -> Jane, how?
//        System.out.println(person2.getName());          //  Jane
    }
}
