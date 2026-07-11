package inheritance;
public class Inheritance {

    public static void main(String[] args) {

        Calc myCalc = new Calc();
        AdvCalc myAdvCalc = new AdvCalc();

        int ans1 = myCalc.add(4, 6);
        int ans2 = myAdvCalc.mult(4, 6);
        int ans3 = myAdvCalc.sub(40, 6);      // accessing sub/add method from myAdvCalc object will require the AdvCalc class to contain the sub/add methods from the Calc class using "extends" keyword 

        System.out.println(ans1 + " " + ans2 + " " + ans3);
    }
}