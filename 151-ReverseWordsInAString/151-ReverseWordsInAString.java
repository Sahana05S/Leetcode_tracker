// Last updated: 2/26/2026, 9:56:50 AM
class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.trim().split("\\s+");
        //char[] reverse = new char[arr.length];
        int i=0,j=arr.length-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
           
        }
        return String.join(" ",arr);
    }
}