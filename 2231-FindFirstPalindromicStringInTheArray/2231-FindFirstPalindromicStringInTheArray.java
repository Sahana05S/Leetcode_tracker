// Last updated: 2/26/2026, 9:04:01 AM
class Solution {
    public String isPalindrome(String w){
        String rev=new StringBuilder(w).reverse().toString();
        if(w.equals(rev)) return w;
        else return null;
        
    }
    public String firstPalindrome(String[] words) {
        String reverse="";
        for(String word:words){
            String palindrome = isPalindrome(word);
            if(palindrome!=null) return word;
            
        }
        return "";
    }
}