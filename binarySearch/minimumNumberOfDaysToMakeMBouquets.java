class Solution {
    public static boolean possible(int[] arr,int day,int m,int k){
        int n = arr.length;
        int count = 0; // it keeps track of consecutive flowers
        int noOfB = 0;

        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                count++;
            } else{
                noOfB += (count/k);
                count =0;
            }
        }
        noOfB += (count/k);
        return noOfB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;
        int n = bloomDay.length;
        if(val > n) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            min = Math.min(bloomDay[i],min);
            max = Math.max(bloomDay[i],max);
        }

        int low = min;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    
}