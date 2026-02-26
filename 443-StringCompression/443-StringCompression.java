// Last updated: 2/26/2026, 9:56:10 AM
class Solution {
    public int compress(char[] chars) {
        int n = chars.length, write = 0, read = 0;
        while (read < n) {
            char ch = chars[read];
            int start = read;
            while (read < n && chars[read] == ch) read++;
            int count = read - start;
            chars[write++] = ch;
            if (count > 1) {
                String c = Integer.toString(count);
                for (int i = 0; i < c.length(); i++) chars[write++] = c.charAt(i);
            }
        }
        return write;
    }
}
