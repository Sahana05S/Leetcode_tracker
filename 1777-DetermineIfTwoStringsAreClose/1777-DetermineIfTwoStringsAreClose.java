// Last updated: 2/26/2026, 9:04:24 AM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        Map<Character,Integer> m1= new HashMap<>();
        Map<Character,Integer> m2= new HashMap<>();
        for(char i:w1) m1.put(i,m1.getOrDefault(i,0)+1);
        for(char j:w2) m2.put(j,m2.getOrDefault(j,0)+1);
        Set<Character> s1=new HashSet<>(m1.keySet());
        Set<Character> s2=new HashSet<>(m2.keySet());
        if(s1.equals(s2)){
            int[] a1=m1.values().stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(a1);
            int[] a2=m2.values().stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(a2);
             return Arrays.equals(a1,a2);
        }
        return false;


    }
}