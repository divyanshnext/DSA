package heap;
import java.util.*;

public class heapImplement {

    private int[] heapArray;
    private int capacity;
    private int current_heap_size;

    public heapImplement(int n){
        capacity = n;
        heapArray = new int[capacity];
        current_heap_size = 0;
    }

    // private void swap(int[] arr,int a, int b){
    //     int temp = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = temp;
    // }

    private int parent(int key){
        return (key-1)/2;
    }

    private int left(int key){
        return 2*key+1;
    }

    private int right(int key){
        return 2*key+2;
    }

    private boolean insertKey(int key){
        if(current_heap_size == capacity){
            return false;
        }
        int i = current_heap_size;
        heapArray[i] = key;
        current_heap_size++;

        while(i != 0 && heapArray[i] < heapArray[parent(i)]){
            swap(heapArray,i,parent(i));
            i = parent(i);
        }
        return true;
    }
    // public void decreaseKey(int key,int new_val){
    //     heapArray[key] = new_val;

    //     while(key != 0 && heapArray[key] < heapArray[parent(key)]) {
    //         swap(heapArray, key, parent(key));
    //         key = parent(key);
    //     }
    // }
    // public int getMin(){
    //     return heapArray[0];
    // }

    // public int extractMin(){
    //     if(current_heap_size <= 0){
    //         return Integer.MAX_VALUE;
    //     }
    //     if(current_heap_size == 1){
    //         current_heap_size--;
    //         return heapArray[0];
    //     }

    //     int root = heapArray[0];
    //     heapArray[0] = heapArray[current_heap_size - 1];
    //     current_heap_size--;
    //     MinHeap(0)
    // }
    public static void main(String[] args){
        heapImplement heap = new heapImplement(10);
        heap.insertKey(3);
        heap.insertKey(2);
        // System.out.println(heap.parent(2));
        // System.out.println(heap.left(1));
        // System.out.println(heap.right(1));
    }
}
