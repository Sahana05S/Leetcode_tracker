// Last updated: 2/26/2026, 9:57:48 AM
class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target) return mid;
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]) right=mid-1;
                else left = mid+1;
            }
            else{
                if(nums[mid]<target && target<=nums[right]) left=mid+1;
                else right = mid-1;
            }
        }
        return -1;
    }
}