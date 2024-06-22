import java.util.*;

public class hashing_basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        n=sc.nextInt();               // let 5
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();   // let 1 3 1 3 6
        }

        //precompute:
        int[] hash = new int[13];
        for(int i=0;i<n;i++){       
            hash[arr[i]] += 1;       // i=0 --> hash[arr[0]] --> which is --> hash[1] --> which will now increment from 0 to 1
                                    //  i=1 --> hash[arr[1]] --> which is --> hash[3] --> which will now increment from 0 to 1
                                   //   i=2 --> hash[arr[2]] --> which is --> hash[1] --> which will now increment from 1 to 2 (it was already 1)
        }

        int q;
        q = sc.nextInt();       // let q = 3 is the query size

        while (q != 0){        
            int number;
            number = sc.nextInt(); // let number = 1 // again let number = 3

            System.out.println(hash[number]);  // hash[1] -- value 2 stored in it it will print 2 // hash[3] -- > gives 1 (coz in hash 1 is stored)
            q--;            // 3 is decremented by 1 which is now 2
        }
        sc.close();
    }
}
