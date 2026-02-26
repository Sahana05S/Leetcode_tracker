// Last updated: 2/26/2026, 9:04:12 AM
class Solution {
    public int largestAltitude(int[] gain) {
       int curr=0,best=0;
       for(int i=0;i<gain.length;i++){
        curr=curr+gain[i];
        if(curr>best) best=curr;
       }
       return best;
    }
}