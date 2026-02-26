// Last updated: 2/26/2026, 9:56:16 AM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            if(!isVowel(arr[i])) i++;
            else if(!isVowel(arr[j])) j--;
            else{
                 char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }}
            return String.valueOf(arr);
    }
            
           /* if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u' ||arr[i]=='A' ||arr[i]=='E' ||arr[i]=='I' ||arr[i]=='O' ||arr[i]=='U' || arr[j]=='a' ||arr[j]=='e' ||arr[j]=='i' ||arr[j]=='o' ||arr[j]=='u' ||arr[j]=='A' ||arr[j]=='E' ||arr[j]=='I' ||arr[j]=='O' ||arr[j]=='U'){
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
            else{
                i++;j--;
            }
        }
        return arr.toString();*/
        public boolean isVowel(char c){
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
                return true;
            else return false;
        }
    
}