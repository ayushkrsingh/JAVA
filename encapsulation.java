class Human {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;    // this.name is used to differentiate between the same variable "name" used inside the setName method as well as the private variable "name".  So this.name represents the private name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        a = age;
    }
    
}

public class encapsulation {
    public static void main(String[] args) {
        Human H1 = new Human();
        H1.setAge(20);
        H1.setName("Ayush");
        System.out.println(H1.getAge());
        System.out.println(H1.getName());        
    }
}
