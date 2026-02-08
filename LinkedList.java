class Node {
    int data;
    Node next; 

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){    // this will be called when we create a node without next node
        this.data = data1;
        this.next = null;
    }
}
public class LinkedList {
    private static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6};
        Node node1 = new Node(arr[2]);
        Node node2 = new Node(arr[3]);
        node1.next = node2;

        System.out.println(node1.next.data); // this will print the data of node2

        // int[] arr2 = {2, 34, 45, 6, 5, 3};
        // int arr3[] = new int[arr2.length];
        // Node mover = new Node(arr2[0]);
        // arr3[0] = mover.data;
        // for(int i=1; i<arr2.length; i++){
        //     Node temp = new Node(arr2[i]);
        //     mover.next = temp;
        //     arr3[i] = mover.data;
        //     mover = temp;
        // }

        // for(int j=0; j<arr3.length; j++){
        //     System.out.println(arr3[j]);
        // }
        int[] arr2 = {2, 434, 34,5, 454,20};
        Node head = convert(arr2);
        
        System.out.println("The 3rd element of the Linked List is: " + (head.next.next).data);
        Node temp = head;
        System.out.println("Linked list is:");
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("Length is: " + length(head));
        
        
        
    }
}
