// Last updated: 2/26/2026, 9:57:01 AM
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s2 = new StringBuilder();
        char[] arr1=s.toCharArray();
        for(char c:arr1){
            if((c>='0' && c<='9') || (c>='a' && c<='z') || (c>='A' && c<='Z')){
                s2.append((char)(c >= 'A' && c <= 'Z' ? c + 32 : c));
            }
        }
        char[] arr2=s2.toString().toCharArray();
        int first=0; int last=arr2.length-1;
        while(first<last){
            char temp = arr2[first];
            arr2[first]=arr2[last];
            arr2[last]=temp;
            first++;
            last--;
        }
        
        String reverse = new String(arr2);
        return s2.toString().equals(reverse);
    }
}