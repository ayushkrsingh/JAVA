class Human {
    private String name;
    private int age;


    // Constructor
    // by default java has an empty Human constructor inside the class

    public Human() {
        System.out.println("Inside the constructor");
        name = "Default Name";
        age = 18;
    }
    public Human(String name, int age) {    // This is Constructor OVERLOADING _ because ---> This is also a constructor, with the same name "Human"
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; 
    }
    public int getAge() {
        return age;
    } 
    public void setAge(int a) {
        a = age;
    }
    
}

public class parameterized_constructor {
    public static void main(String[] args) {
        Human H1 = new Human();
        Human H2 = new Human("Ayush", 18);  // we can directly pass name and age because of the second constructor we made with accepting arguments instead of default name and age as the first constructor does.. 
        System.out.println(H1.getName() + " " + H1.getAge());
        System.out.println(H2.getName() + " " + H2.getAge());
    }
}
