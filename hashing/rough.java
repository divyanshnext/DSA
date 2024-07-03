import java.util.*;

public class rough {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{3,2,9,6,3,1,2,6,9,1,3};

        
//precomputation
        int[] hash = new int[10];

        for(int i=0;i<arr.length;i++){
            hash[arr[i]] += 1;
        }

        // for(int i=0;i<=arr.length;i++){
        //     System.out.println(hash[i]);
        // }

        int q;
        q = sc.nextInt();

        System.out.println(hash[q]);
    }
}
