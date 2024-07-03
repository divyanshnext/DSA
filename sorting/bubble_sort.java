package sorting;

import java.util.Scanner;

public class bubble_sort {
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

    // to sort it using bubble sort
    for(int i=0;i<n-1;i++){
        int didswap = 0;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didswap = 1;
            }

        }
        if(didswap == 0){
            break;
        }
    }

    System.out.println("Sorted array");
    for(int i =0;i<n;i++){
        
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
}
