class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=1;
        long min=time[0];
        for(int i:time){
            min=Math.min(i,min);
        }
        long right=totalTrips*min;
        while(left<right){
            long mid=(right-left)/2+left;
            long total=total(time,mid);
            if(total<totalTrips){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
    public static long total(int[]time,long trip){
        long total=0;
        for(int i:time){
            total+=trip/i;
        }
        return total;
    }
}