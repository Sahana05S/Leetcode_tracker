// Last updated: 2/26/2026, 9:04:17 AM
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int p=0,q=nums.length-1,count=0;
        while(p<q){
            if(nums[p]+nums[q]==k){
                count++;
                p++;q--;
            }
            else if(nums[p]+nums[q]<k) p++;
            else q--;
        }
        return count;
    }
}