// Last updated: 2/26/2026, 9:04:38 AM
class Solution {
    public int maxVowels(String s, int k) {
        int max=0,count=0;
        char[] c=s.toCharArray();
        int n=c.length;
        for(int i=0;i<k;i++){
            if(isVowel(c[i])) count++;
        }
        max=count;
        for(int j=k;j<n;j++){
            if(isVowel(c[j-k])) count--;
            if(isVowel(c[j])) count++;
            max=Math.max(max,count);
        }
        
        return max;
    }
    public boolean isVowel(char c){
        if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
}