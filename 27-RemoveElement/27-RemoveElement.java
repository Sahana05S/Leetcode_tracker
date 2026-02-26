// Last updated: 2/26/2026, 9:57:59 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:nums){
		    if(i!= val) ans.add(i);
		}
        for(int i=0;i<ans.size();i++) nums[i] = ans.get(i);
        return ans.size();
    }
}