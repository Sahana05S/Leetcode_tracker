// Last updated: 2/26/2026, 9:56:48 AM
class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans = new StringBuilder();
        while(n>0){
            n--;
            int r = n%26;
            ans.append((char)(r+'A'));
            n /= 26;
        }
        return ans.reverse().toString();
        
    }
}