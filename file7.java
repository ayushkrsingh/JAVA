// CLASSE AND OBJECT THEORY IN JAVA
class Calculator{
    int a;
    public int multiply(int n1, int n2){
        int r = n1*n2;
        return r;
    }
}


public class file7 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.multiply(num1, num2);
        System.out.println(result);
    }
}
