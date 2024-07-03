package sorting;

import java.util.Scanner;

public class recursive_bubble_sort {
    static void recursive_bubble(int[] arr,int n){
        if(n==1) return;
        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        recursive_bubble(arr,n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Unsorted array");
    for(int i =0;i<n;i++){
        
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    recursive_bubble(arr,n);

    System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    sc.close();
}
}
