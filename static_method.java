class Mobile{
    static String name;  // static variable
    String brand;
    int price;
    
    public static void show(Mobile obj) {        // static method which can be called without creating object of class
        // System.out.println(name + " : " + brand + " : " + price);        // error: we cannot access non-static variables inside static method
        System.out.println(name + " : " + obj.brand + " : " + obj.price);   // this is one way to access non-static variables inside static method
    }
}


public class static_method{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        Mobile.name = "SmartPhone";   // accessing static variable using class name
        
        // Mobile.name = "Smartphone";    // static variable is shared among all instances
        m1.brand = "Motorola";
        m1.price = 22000;

        Mobile m2 = new Mobile();
        // Mobile.name = "Nanophone";   // here i changed the static variable value then it will be changed for all instances
        m2.brand = "IQOO";
        m2.price = 12000;

        // m1.show();  // error: cannot call static method using object reference
        Mobile.show(m1);  // calling static method using class name
        Mobile.show(m2);  // calling static method using class name
    }
}
