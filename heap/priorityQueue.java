package heap;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        System.out.println("Head of the priority Queue : "+p.peek());
        System.out.println("Printing the top element and removing it : "+p.poll());
        System.out.println("Head of the priority Queue : "+p.peek());
    }
}
