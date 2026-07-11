class A{
    public void show(){
        System.out.println("Inside A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("Inside B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("Inside C show");
    }
}

// A variable of type parent class can refer to the objects of its subclass, 
// in this case below, A type obj can be later referred to new B() or new C()

public class Polymorphism_DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();         /// Inside A show

        obj = new B();
        obj.show();         /// Inside B show

        obj = new C();
        obj.show();         /// Inside C show
    }
}
