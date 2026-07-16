public class WrapperClass {
    public static void main(String[] args) {
        int num = 923;

        Integer num1 = num;     //autoboxing

        int num2 = num1;       //auto-unboxing
        System.out.println(num2);

        String num3 = "21";
        int num4 = Integer.valueOf(num3);
        System.out.println(num4);

        String num5 = Integer.toString(num2);
        System.out.println(num5.length());      //  num5 is a String

        
        
        // double num4 = 23.11;
    }
}
