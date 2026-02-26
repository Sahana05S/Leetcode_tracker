// Last updated: 2/26/2026, 9:56:01 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int count=0;
        int length=flowerbed.length;
        for(int i=0;i<length;i++){
        if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&  (i == length - 1 || flowerbed[i + 1] == 0)){
            flowerbed[i]=1;
            count++;
            if(count>=n) return true;
        }
        }
        return count>=n;
    }
}