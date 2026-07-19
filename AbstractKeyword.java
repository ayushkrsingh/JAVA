//---- Abstract methods must be inside abstract class and cannot be static, final or private.

//---- We cannot create object of abstract class but we can create reference variable of abstract class and can refer to subclass object. --- Like we did here

//---- Abstract methods must be implemented in the subclass otherwise it will give compile time error


abstract class Car{     // abstract class can have abstract methods and concrete methods

    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }

}


class Dodge extends Car{
    public void drive(){            // implementation of abstract method is "MANDATORY" in subclass
        System.out.println("Driving");      
    }
    public void features(){         // additional method in subclass
        System.out.println("Features of Dodge");
    }
}





public class AbstractKeyword {
    public static void main(String[] args) {
        Car myCar = new Dodge();  // reference variable of abstract class referring to subclass object
        myCar.drive();            // calling implemented abstract method
        myCar.playMusic();        // calling concrete method of abstract class
    }
    
}