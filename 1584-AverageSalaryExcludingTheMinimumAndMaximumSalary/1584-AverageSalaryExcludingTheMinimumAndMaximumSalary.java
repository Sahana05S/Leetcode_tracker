// Last updated: 2/26/2026, 9:04:35 AM
class Solution {
      public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min= i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public double average(int[] salary) {
        int[] s=sort(salary);
        double sum=0;
        for(int i=1;i<s.length-1;i++){
            sum += s[i];
        }
        return sum/(s.length-2);
        
    }
}