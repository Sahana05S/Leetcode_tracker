// Last updated: 2/26/2026, 9:56:20 AM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        /*int j=0;
        for(int i=0;i<nums.length;i++){
            int j=0;
            //int p=nums[i],q=nums[i+1],r=nums[i+2];
            //if(p<q && q<r){
            if((nums[j]<nums[++j]) && nums[j]<nums[++j]){
                return true;
            }//}
        }*/
        if(nums==null || nums.length<3) return false;
        int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=m1) m1=nums[i];
            else if(nums[i]<=m2) m2=nums[i];
            else return true;
        }
        return false;
    }
}