// Last updated: 2/26/2026, 9:56:15 AM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c=(a&b)<<1;
            a=a^b;
            b=c;
        }
        return a;
    }
}