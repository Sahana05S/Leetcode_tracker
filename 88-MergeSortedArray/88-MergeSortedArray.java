// Last updated: 2/26/2026, 9:57:17 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
                nums1[m+i] = nums2[i];
            
        }
        for(int j=0;j<nums1.length-1;j++){
	        for(int i=0;i<nums1.length-1;i++){
	            if(nums1[i]>nums1[i+1]){
	                int t = nums1[i];
	                nums1[i] = nums1[i+1];
	                nums1[i+1] = t;
	            }
	        }
	    }
    }
}