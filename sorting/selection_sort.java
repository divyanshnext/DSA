package sorting;
import java.util.Scanner;

public class selection_sort {

        public static void selection_sorting(int[] arr,int n){
            for(int i=0;i<n-1;i++){
                int minIndex = i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[minIndex]){
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        
            System.out.println("Sorted array");
            for(int i =0;i<n;i++){
                
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }

        public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    System.out.print("Unsorted array");
    for(int i =0;i<n;i++){
        
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    selection_sorting(arr,n);

    }
}
