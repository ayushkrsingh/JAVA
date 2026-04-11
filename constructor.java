class Human {
    private String name;
    private int age;


    // Constructor

    public Human(){
        System.out.println("Inside the constructor");
        name = "Default Name";
        age = 18;
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

public class constructor {
    public static void main(String[] args) {
        Human H1 = new Human();
        System.out.println(H1.getName() + " " + H1.getAge());
    }
}
