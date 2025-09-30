//STRING BUFFER AND STRING BUILDER-------------
public class BufferBuilder {
    public static void main(String[] args) {

        // StringBuffer is thread safe meaning multiple threads can access it simultaneously and it is synchronized
        // StringBuilder is non synchronized and not thread safe

         StringBuffer sb = new StringBuffer("Ayush");
        //  System.out.println(sb.length());            // 5
        // System.out.println(sb.capacity());           // 21
        sb.append(" Kumar Singh");
        sb.deleteCharAt(4); // 4th index character will be deleted
        sb.insert(4, "h then"); // "h then" will be inserted at 4
        sb.setLength(30); // length will be set to 30
         System.out.println(sb.length());            // 30
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
    }
}
