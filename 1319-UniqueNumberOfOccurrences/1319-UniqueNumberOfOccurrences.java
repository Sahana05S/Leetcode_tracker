// Last updated: 2/26/2026, 9:04:46 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer,Integer> count = new HashMap<>();
       for(int i:arr) count.put(i,count.getOrDefault(i,0)+1);
       Set<Integer> r=new HashSet<>(count.values());
       return count.size() == r.size();
    }
}