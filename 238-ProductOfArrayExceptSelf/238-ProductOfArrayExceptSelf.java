// Last updated: 2/26/2026, 9:56:33 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix=1,suffix=1;
        for(int i=0;i<nums.length;i++){
                answer[i]=prefix;
                prefix*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){    
                answer[i]*=suffix;
                suffix*=nums[i];

        }
        return answer;
    }
}