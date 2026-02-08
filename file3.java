import java.util.*;

public class file3 {
    public static void main(String[] args) {
        // System.out.println("Enter your name: ");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is " + name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float var1 = sc.nextFloat();   //nest-> one word,   nextLine-> multiple words,  nextInt-> integer, nextDouble-> double, nextFloat-> float, nextBoolean-> boolean

        System.out.println("Enter second number: ");
        float var2 = sc.nextFloat();

        float sum = var1 + var2;
        System.out.println("Sum is: " + sum);
    }
}   
