// Last updated: 2/26/2026, 9:04:40 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>max) max=candies[i];}
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=max) 
                result.add(true);
            else result.add(false);
        }
        return result;
    }
}