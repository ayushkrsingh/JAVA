//Conditional Statements:
import java.util.*;
public class file4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are an adult");
        } else{
            System.out.println("You are NOT an adult");
        }
    }
}