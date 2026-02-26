// Last updated: 2/26/2026, 9:56:22 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        if(n==1) return true;       
        if(n%3!=0) return false;
        return isPowerOfThree(n/3);

    }
}