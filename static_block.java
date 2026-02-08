class Mobile{
    static String name;  // static variable
    String brand;
    int price;

    // ####### static block loads first when the class is loaded and it is loaded only once


    static {   // static block: used to initialize static variables, executed when the class is loaded

        name = "Smartphone";    // initializing static variable
        System.out.println("Static block executed");

    }


    public Mobile(){   // constructor
        brand = "DefaultBrand";
        price = 200;
        System.out.println("Constructor executed");
    }


    public void show(){    //non-static method
        System.out.println(name + " : " + brand + " : " + price);
    }
}


public class static_block {
    public static void main(String[] args){
        Mobile m1 =  new Mobile();
        // m1.brand = "Motorola";
        // m1.price = 22000;   
        m1.show(); 


        //if we do not create any object then nothing will be printed because static block is executed when the class is loaded and class is loaded when we create the object of that class

        // to forcefully load the class without creating its object we can use 
        // Class.forName("Mobile");   // this will load the class and execute the static block
        
    }
}
