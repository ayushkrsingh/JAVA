class Mobile{
    static String name;  // static variable
    String brand;
    int price;
    
    public void show(){
        System.out.println(name + " : " + brand + " : " + price);
    }
}


public class static_keyword{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        Mobile.name = "SmartPhone";   // accessing static variable using class name
        
        m1.name = "Smartphone";    // static variable is shared among all instances
        m1.brand = "Motorola";
        m1.price = 22000;

        Mobile m2 = new Mobile();
        // Mobile.name = "Nanophone";   // here i changed the static variable value then it will be changed for all instances
        m2.brand = "IQOO";
        m2.price = 12000;

        m1.show();
        m2.show();
    }
}
