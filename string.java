

public class string {
    public static void main(String[] args) {
        // String name = "Ayush";       //--------MOST USED--------
        // System.out.println(name);
        
        String name = new String("Ayush");   //-------MANUALLY CREATED BUT UPPER EXAMPLE IS EASIER-------
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.concat(" Kumar"));      // Ayush Kumar
        System.out.println(name + " Singh");            // Ayush Singh

        //String variable once build in java is constant, you cannot change it.

        String s1 = "Example";          // here both S1 and S2 are reffering to same object build in heap memory with the data "Example" in it, they are not separate objects in the memory.
        String s2 = "Example";


        name = name + " Kumar Singh";       // Does not change the value of name, it just forms another object in heap and changes the address of name to the new obj formed
        System.out.println(name);
    }
}
