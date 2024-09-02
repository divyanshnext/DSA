class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1,Node next1,Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1){
        this.data=data1;
        this.next = null;
        this.prev = null;
    }

    Node(int data1,Node prev1){
        this.data = data1;
        this.prev = prev1;
        this.next = null;
    }

}

public class doublyLL {

    public Node convertArrayToDoublyLL (int[] arr){
        int size = arr.length;

        Node head = new Node(arr[0]);
        // Node temp = head;
        Node prev = head;

        for(int i=1;i<size;i++){
            Node newNode = new Node(arr[i],prev);
            prev.next = newNode;
            prev = newNode;
        }

        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        doublyLL convert = new doublyLL();
        Node result = convert.convertArrayToDoublyLL(arr);
        System.out.println(result);  
    }
}
