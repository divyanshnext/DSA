package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LLimplementation {

    private static Node convertArr2LL(int[] arr){
        if (arr.length == 0) {
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5};
        Node head = convertArr2LL(arr);
        
        // Print the linked list to verify correctness
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
