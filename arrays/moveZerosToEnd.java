package arrays;

import java.util.*;

public class moveZerosToEnd{

    public static int[] movesZeros(int[] arr,int n){
        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            temp.add(arr[i]);
            }
        }

        int nz = temp.size();

        for(int i=0;i<nz;i++){
            arr[i] = temp.get(i);
        }

        for(int i=nz;i<n;i++){
            arr[i]=0;
        }

        return arr;


    }
    public static void main(String[] args){
        int[] arr = {1,2,3,0,6,0,8,9,0,10};
        int n = arr.length;
        int[] ans = movesZeros(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
