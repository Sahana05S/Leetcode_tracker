// Last updated: 2/26/2026, 9:03:26 AM
class Solution {
    public String triangleType(int[] nums) {
        String result = new String();
        if((nums[0]+nums[1]<=nums[2]) || (nums[1]+nums[2]<=nums[0]) || (nums[0]+nums[2]<=nums[1])) result="none";
        else if((nums[0]==nums[1]) && (nums[1]==nums[2])){
            result="equilateral";
        }
        else if((nums[0]==nums[1]) || (nums[1]==nums[2]) ||(nums[2]==nums[0])) result="isosceles";
        else result="scalene";
        return result;
    }
}