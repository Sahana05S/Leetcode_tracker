// Last updated: 2/26/2026, 9:03:28 AM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int good=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if((i-k<0 || nums[i]>nums[i-k]) && (i+k>=nums.length || nums[i]>nums[i+k])) good+=nums[i];
        }
        return good;
    }
}