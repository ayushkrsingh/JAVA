// Final Variable: Cannot be reassigned once initialized. It is like a constant.
// Final Class: Cannot be inherited. 
// Final Method: Cannot be overridden by subclasses.

class Calculator {          // if we declare this class as final, then it cannot be inherited by any other class (which is AdvancedCalculator in this case)
    public final void display() {
        System.out.println("This is a final method.");
    }
}
class AdvancedCalculator extends Calculator {
    // public void display() {  // This will give an error because display() is final in Calculator class
    //     System.out.println("This is an overridden method.");
    // }
}

public class FinalKeyword {

    public static void main(String[] args) {

        // Final Variable------
        final int num = 9;
        // num = 10;        // this will give error because num is final and cannot be reassigned (like constant)
        System.out.println(num);
        
        
    }
}