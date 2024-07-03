package sorting;

import java.util.Scanner;

public class insertion_sort {
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

    for(int i=0;i<=n-1;i++){
        int j = i;

        while ( j > 0 && arr[j-1]>arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

            j--;
        }


    }
    System.out.println("Sorted array");
    for(int i =0;i<n;i++){
        
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
    

}
