// Last updated: 2/26/2026, 9:57:30 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); 
        int lastSpace = s.lastIndexOf(' ');
        return s.length() - lastSpace - 1;
    }
}
