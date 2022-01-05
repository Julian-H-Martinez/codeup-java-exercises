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
        Person julian = new Person();
//        System.out.println(julian);
        julian.setName("Julian");
        System.out.println(julian.name);
        julian.sayHello();
    }
}
