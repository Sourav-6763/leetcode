class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum=arrivalTime+delayedTime;
        int ans=sum%24;
        return ans;
    }
}