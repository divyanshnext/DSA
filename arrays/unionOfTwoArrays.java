//brutforce approach - vs code
//optimal approach - striver sheet --> question links --> geeksForGeeks & Leetcode

package arrays;
import java.util.HashSet;
import java.util.Set;

public class unionOfTwoArrays {

    public Set<Integer> unionOfArrays(int[] arr1,int[] arr2, int n1, int n2){
        Set<Integer> union = new HashSet<>();

        for(int i=0;i<n1;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            union.add(arr2[i]);
        }
        return union;
    }
    public static void main(String[] args){
        unionOfTwoArrays uota = new unionOfTwoArrays();

        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        int n1 = arr1.length;
        int n2 = arr2.length;

        Set<Integer> union = uota.unionOfArrays(arr1,arr2,n1,n2);
        
        System.out.println("union of the arrays is "+ union);
    }
}

