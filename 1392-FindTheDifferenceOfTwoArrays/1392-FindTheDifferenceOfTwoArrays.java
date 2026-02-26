// Last updated: 2/26/2026, 9:04:42 AM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i:nums1) s1.add(i);
        for(int j:nums2) s2.add(j);
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:s1){
            if(!s2.contains(i)) l1.add(i);
        }
        for(int j:s2){
            if(!s1.contains(j)) l2.add(j);
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2);
        return result;
    }
}