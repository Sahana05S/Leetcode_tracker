// Last updated: 2/26/2026, 9:56:12 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int p=0,q=0;
        while(p<s.length() && q<t.length()){
            if(s.charAt(p) == t.charAt(q)){
                p++;
            }q++;
        }
        if(p==s.length()) return true;
        return false;
       /* char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();

        for(int i=0;i<tarr.length;i++){
            for(int j=0;j<sarr.length;j++){
                if(sarr[j]==tarr[i]) q++;
            }
            p++;
        }
        if(q==sarr.length) return true;
        return false;*/
    }
}