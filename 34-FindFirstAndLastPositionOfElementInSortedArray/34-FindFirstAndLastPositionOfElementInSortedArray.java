// Last updated: 2/26/2026, 9:57:34 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[]{first,last};
    }
    private int findFirst(int[] nums,int target){
        int left = 0,right=nums.length-1,bound = -1;
        while(left<=right){
        int mid = (left + right)/2;
        if(nums[mid] == target){
            bound = mid;
            right = mid-1;
        }
        else if(nums[mid]<target) left = mid+1;
        else right = mid-1;
        } 
        return bound;
    }
    private int findLast(int[] nums,int target){
        int left = 0,right=nums.length-1,bound = -1;
        while(left<=right){
            int mid = (left + right)/2;
        if(nums[mid] == target){
            bound = mid;
            left = mid+1;
        }
        else if(nums[mid]<target) left = mid+1;
        else right = mid-1;
        }
        
        return bound;
    }
}