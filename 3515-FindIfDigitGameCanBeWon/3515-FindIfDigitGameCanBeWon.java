// Last updated: 2/26/2026, 9:03:33 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10) sum1+=nums[i];
            else sum2+=nums[i];
        }
     
        //if(sum1==sum2) return false;
        if(sum1>sum2 || sum2>sum1) return true;
        //else if(sum2>sum1) return true;
        //else return false;
        return false;
    }
}