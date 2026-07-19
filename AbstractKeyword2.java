//---- Abstract methods must be inside abstract class and cannot be static, final or private.

//---- We cannot create object of abstract class but we can create reference variable of abstract class and can refer to subclass object. --- Like we did here

//---- Abstract methods must be implemented in the subclass otherwise it will give compile time error


abstract class Car{     // abstract class can have abstract methods and concrete methods

    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing Music");
    }

}


abstract class Dodge extends Car{      // if we don't implement abstract methods of parent class in subclass then subclass must be declared as abstract class
    public void drive(){
        System.out.println("Driving");      
    }
    // fly() method is not implemented here so this class must be declared as abstract class
}

class Challenger extends Dodge{   // Concrete Class
    public void fly(){
        System.out.println("Flying");
    }
    public void features(){      
        System.out.println("Features of Challenger");
    }
}



public class AbstractKeyword2 {
    public static void main(String[] args) {
        
        Car myCar = new Challenger();  // reference variable of abstract class referring to subclass object
        myCar.drive();            // calling implemented abstract method
        myCar.fly();              // calling implemented abstract method
        myCar.playMusic();        // calling concrete method of abstract class


        // myCar.features();        // cannot call this method because reference variable is of abstract class and this method is not present in abstract class
    }
    
}

