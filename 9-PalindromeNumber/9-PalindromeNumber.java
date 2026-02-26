// Last updated: 2/26/2026, 9:58:14 AM
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int r=0;
        if(x<0) return false;
        while(x!=0){
            int d=x%10;
            r=r*10+d;
            x=x/10;
        }
        if(n==r) return true;
        else return false;
    }
}