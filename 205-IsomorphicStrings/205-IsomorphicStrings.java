// Last updated: 2/26/2026, 9:56:40 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sToT.containsKey(sc)) {
                if (sToT.get(sc) != tc) return false;
            } else {
                if (tToS.containsKey(tc)) return false;
                sToT.put(sc, tc);
                tToS.put(tc, sc);
            }
        }

        return true;
    }
}
