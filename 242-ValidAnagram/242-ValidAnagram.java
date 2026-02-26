// Last updated: 2/26/2026, 9:56:32 AM
class Solution {
    public Boolean isAnagram(String s, String t) {
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        boolean r = Arrays.equals(x,y);
        
        if(r) return true;
        else return false;
        
    }
}