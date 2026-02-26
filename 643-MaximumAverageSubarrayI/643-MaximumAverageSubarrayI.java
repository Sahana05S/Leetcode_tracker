// Last updated: 2/26/2026, 9:55:57 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0,maxSum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];}
        maxSum=sum;
        for(int j=k;j<nums.length;j++){
            sum+=nums[j];
            sum-=nums[j-k];
            if(sum>maxSum) maxSum=sum;
        }
        return maxSum/(double) k;
          
    }
}