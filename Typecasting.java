class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}

public class Typecasting {
    public static void main(String[] args) {
        //Upcasting
        A obj1 = (A) new B();       // No need to write (A) new B() because B is a subclass of A, so it is automatically typecasted to A.
        obj1.show1();

        //Downcasting
        B obj2 = (B) obj1;            // Downcasting is not automatic, so we need to explicitly typecast it to B.
        obj2.show2();
    }
}
