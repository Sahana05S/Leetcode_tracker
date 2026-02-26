// Last updated: 2/26/2026, 9:04:59 AM
class Solution {
    public int[] sortArray(int[] nums) {
        split(nums);
        return nums;
    }
    private static void split(int[] arr) {
        int len=arr.length;
        if(len<=1) return ;
        int mid=len/2;
        int[] larray = new int[mid];
        int[] rarray = new int[len-mid];
        int j=0;
        for(int i=0;i<len;i++){
            if(i<mid) larray[i]=arr[i];
            else{
                rarray[j]=arr[i];
                j++;
            }
        }
        split(larray);
        split(rarray);
        merge(larray,rarray,arr);
    }

    private static void merge(int[] larray, int[] rarray, int[] arr) {
       int lsize=larray.length;
       int rsize=rarray.length;
       int i=0,le=0,ri=0;
       while (le<lsize && ri<rsize) {
        if(larray[le]<rarray[ri]){
            arr[i]=larray[le];
            i++;
            le++;
        }
        else{
            arr[i]=rarray[ri];
            i++;
            ri++;
        }
       }
       while(le<lsize){
         arr[i]=larray[le];
            i++;
            le++;
       }
      while (ri<rsize) {
        arr[i]=rarray[ri];
            i++;
            ri++;
      }
    }
}