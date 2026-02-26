// Last updated: 2/26/2026, 9:04:20 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            boolean isValid = true;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (allowed.indexOf(ch) == -1) {
                    isValid = false;
                    break;
                }
            }
            if (isValid)
                count++;
        }
        return count;

    }
}