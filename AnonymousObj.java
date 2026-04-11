class A {
    public A() {
        System.out.println("Object Created!");
    }
    public void show() {
        System.out.println("Inside A show");
    }

}


public class AnonymousObj {
    public static void main(String[] args) {

        // A obj = new A();
        // obj.show();          

        // or 
        
        new A();                // output: Object created!          // this is an anonymous object
        new A().show();         // a new object is created and the show method is called
    }
}

// We cannot reuse the object created anonymously because we have not declared it to a variable lets say obj