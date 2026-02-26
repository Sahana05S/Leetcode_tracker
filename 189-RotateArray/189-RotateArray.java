// Last updated: 2/26/2026, 9:56:44 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //int n_k = k*-1;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private void reverse(int[] a, int l, int r) {
        while (l < r) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++; r--;
        }
    }
}