// Last updated: 2/26/2026, 9:04:33 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,zeros=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
            while(zeros>1){
                if(nums[left]==0) zeros--;
                left++;
            }
            ans = Math.max(ans,(i-left));
        }
        return ans;
    }
}