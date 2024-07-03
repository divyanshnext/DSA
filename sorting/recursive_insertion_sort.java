package sorting;

import java.util.Scanner;

public class recursive_insertion_sort {
    static void recursive_insertion(int[] arr,int i,int n){

        if(i==n) return;

        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursive_insertion(arr,i+1,n);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Give "+n+ " Unsorted array");

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }


    recursive_insertion(arr,0,n);

    System.out.println("Sorted array");
    for(int i =0;i<n;i++){
        
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}
