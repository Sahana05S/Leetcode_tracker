// Last updated: 2/26/2026, 9:58:12 AM
class Solution {
    public int maxArea(int[] height) {
        int max=0,product=1;
        int left=0,right=height.length-1;
        while(left<right){
            product=Math.min(height[left],height[right])*(right-left);
            if(product>max) max=product;
            if(height[left]>height[right]) right--;
            else left++;
        }
        return max;
        
    }
}