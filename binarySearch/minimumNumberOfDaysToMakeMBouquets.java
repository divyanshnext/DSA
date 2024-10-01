public class minimumNumberOfDaysToMakeMBouquets{ 
    public static void main(String[] args){
        int[] bloomDay = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;

        minDay(bloomDay,m,k);
    }
    
    public static int minDay(int[] bloomDay,int m,int k){
        int size = bloomDay.length;

        if(m*k>size) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<=size;i++){
            mini = Math.min(bloomDay[i],mini);
            maxi = Math.max(bloomDay[i],maxi);
        }

        for(int i=mini;i<=maxi;i++){
            if(possible(bloomDay,i,m,k)) return i;
        }
        return -1;
    }

    public static boolean possible(int[] bloomDay,int day,int m,int k){
        int n = bloomDay.length;
        int cnt = 0;
        int noOfB = 0;

        for(int i=0;i<=n;i++){
            if(bloomDay[i] <= day) {
                cnt++;
            }
            else{
                noOfB += (cnt/k);
                cnt = 0;
            }
        }
        noOfB += (cnt/k);
        return noOfB>=m;
    }

    
}