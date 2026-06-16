// Last updated: 6/16/2026, 11:37:44 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        StringBuilder merged = new StringBuilder();
4        int w1 = word1.length();
5        int w2 = word2.length();
6        int len = Math.min(w1,w2);
7        for(int i=0;i<len;i++){
8            merged.append(word1.charAt(i)).append(word2.charAt(i));
9        }
10        if(w1==w2) return merged.toString();
11        else if(w1>w2){
12            return merged.append(word1.substring(len)).toString();
13        }
14        else{
15            return merged.append(word2.substring(len)).toString();
16        }
17    }
18}