import java.util.*;

public class patterns {
    public static void main(String[] args) {
        

        // &&&&&&&&&&&&&&&      SOLID REACTANGLE         &&&&&&&&&&&&&&&
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Length:");
        // int length = sc.nextInt();
        // System.out.println("Breadth:");
        // int breadth = sc.nextInt();
        // for(int i=1; i<=breadth; i++){
        //     for(int j=1; j<=length; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }



        
        // &&&&&&&&&&&&&&&      HOLLOW REACTANGLE         &&&&&&&&&&&&&&&
        // !!!!!!!         !!!!!!!!

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Length:");
        // int length = sc.nextInt();
        // System.out.println("Breadth:");
        // int breadth = sc.nextInt();
        // for(int i=1; i<=breadth; i++){
        //     if (i!=1 && i!=breadth) {
        //         System.out.print("*");
        //         for(int k=1; k<=length-2; k++){
        //             System.out.print(" ");
        //         }
        //         System.out.print("*");
        //     }else{
        //         for(int j=1; j<=length; j++){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println("");
        // }



        //$$$$$$$$$$$$$$ HOLLOW RECTANGLE ~ prachi $$$$$$$$$$$$$$$$$$

        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < col ; j++){
        //         if(i == 0 || i == row-1){
        //             System.out.print("*");
        //         }
        //         else if(j == 0 || j == col-1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }



//              ************* PYRAMID ***********


        // Scanner sc =  new Scanner(System.in);
        // int height = sc.nextInt();
        // int length = 2*height-1;
        // for(int i = 1; i<=height; i++){
        //     for(int j = 1; j<=length; j++){
        //         if(j>(length-(2*i-1))/2 && j<=(length-(length-(2*i-1))/2)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }




        // ########## INVERTED PYRAMID ###########

        // Scanner sc = new Scanner(System.in);
        // int height = sc.nextInt();
        // int length = 2*height-1;
        // for(int i = height; i>0; i--){
        //     for(int j = length; j>0; j--){
        //         if(j>(length-(2*i-1))/2 && j<=(length-(length-(2*i-1))/2)){
        //                  System.out.print("*");
        //         }else{
        //              System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        


        //&&&&&&&&&&&   BADA X   &&&&&&&&&&&&&&&


        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int length = 2*height+1;


        for(int i = height+1; i>0; i--){
            for(int j = length; j>0; j--){
                if(j==((length-(2*i-1))/2)+1 || j==(length-(length-(2*i-1))/2)){
                         System.out.print("*");
                }else{
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 2; i<=height+1; i++){
            for(int j = 1; j<=length; j++){
                if(j==((length-(2*i-1))/2)+1 || j==(length-(length-(2*i-1))/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



        //--------------- printing number triangle

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //--------------- printing inverted number triangle

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }




        //--------------- printing continuous number triangle


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int number = 0;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         number++;
        //         System.out.print(number+" ");
        //     }
        //     System.out.println();
        // }


        //---------- Printing "CONSECUTIVE" 0and1 triangle ;

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean number = false;
        // for(int i = 1; i<=n; i++){
        //     for (int j = 1; j <= i; j++) {
        //         if (number == false) {
        //             System.out.print("1 ");                    
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //         number = !number;
        //     }
        //     System.out.println();
        // }


        //


    }
}
