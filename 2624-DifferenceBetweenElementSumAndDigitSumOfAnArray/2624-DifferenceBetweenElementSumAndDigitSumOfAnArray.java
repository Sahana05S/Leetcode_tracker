// Last updated: 2/26/2026, 9:03:30 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,digitSum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(nums[i]!=0){
                int temp=nums[i]%10;
                digitSum+=temp;
                nums[i]/=10;
            }
        }
        return Math.abs(sum-digitSum);

    }
}