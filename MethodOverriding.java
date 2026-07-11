// class Calc{
//     public int add(int n1, int n2){
//         return n1+n2;
//     }
// }
// class AdvCalc extends Calc{
//     public int add(int n1, int n2){     // exact same method as in the Calc class but the output is changed, this is method overriding
//         return n1+n2+1;
//     }
// }

// // So firstly the object made from AdvCalc class searches for the add method inside the AdvCalc class and it finds the overrided method and calls it, 
// /// but if we comment out the one in the AdvCalc then since the AdvCalc class extends Calc, the called method will no find add method inside the AdvCalc and proceeds to call the original add method inside the Calc class.


// public class MethodOverriding {

//     public static void main(String[] args) {
//         AdvCalc obj = new AdvCalc();
//         int r1 = obj.add(5, 4);
//         System.out.println(r1);
//     }
// }