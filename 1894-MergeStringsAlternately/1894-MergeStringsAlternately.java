// Last updated: 2/26/2026, 9:04:10 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int temp1 = 0;
        int temp2 = 0;
        while(temp1<word1.length() || temp2<word2.length()){
           if(temp1<word1.length()) sb.append(word1.charAt(temp1++));
            if(temp2<word2.length()) sb.append(word2.charAt(temp2++));
        }
        return sb.toString();
    }
}