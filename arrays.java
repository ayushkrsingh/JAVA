public class arrays {
    public static void main(String a[]){
        int arr[] = {1, 2, 3, 56, 66};
        System.out.println(arr[1]);

        // Multi diminsional array-----------
        int arr2[][] = new int[3][4];
        // arr2[1][2] = 7;

        System.out.println(arr2[1][2]);
        System.out.println();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){      // here we did'nt assign any value for the 4th column that is 3rd index of each of 3 arrays...., but still it works, just the 4th column remains all zero as it is
                arr2[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Jagged array---- no. of elements is different for each array formed;
        int arr3[][]= new int[3][];
        arr3[0] = new int[4];
        arr3[1] = new int[2];
        arr3[2] = new int[5];

        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                arr3[i][j] = (int)(Math.random() * 10);
            }
        }

        //Simple For loop---------------------------------------
        // for(int i=0; i<arr3.length; i++){
        //     for(int j=0; j<arr3[i].length; j++){
        //         System.out.print(arr3[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //Enhanced For loop--------------------------------------(easier than simple for loop)
        for(int n[] : arr3){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        //  THREE DIMENTIONAL ARRAY is just array inside array inside array and the item is fetched as like arr3d[i][j][k], where i, j, k are indices of arrays nested inside one another.
    }
}
