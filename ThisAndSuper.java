// Every class in Java extends the Object class 



class A extends Object{       // Every class in Java extends the Object class by default, its just hidden
    public A(){
        super();      // super method is always there in each constructor
        System.out.println("Inside Default Constructor A");
    }
    public A(int n){
        System.out.println("Inside Parameterized Constructor A");
    }
}
class B extends A{
    public B(){
        super(6);
        System.out.println("Inside Default Constructor B");
    }
    public B(int n){
        this();        // this() will call the default constructor 
        System.out.println("Inside Parameterized Constructor B");
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {
        B obj = new B(5);
    }
}