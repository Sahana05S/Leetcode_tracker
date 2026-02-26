// Last updated: 2/26/2026, 9:57:32 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int[] result=new int[nums.length+1];
        int start=0,end=nums.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) start=mid+1;
        else if(nums[mid]>target) end=mid-1;
    }
    return start;}
}