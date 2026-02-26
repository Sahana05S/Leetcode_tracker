// Last updated: 2/26/2026, 9:04:47 AM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
      String s="";
      if(!str1.concat(str2).equals(str2.concat(str1))) return "";
      int len1=str1.length();
      int len2 = str2.length();
      int gcdval= find_gcd(len1,len2);
      return str1.substring(0,gcdval);
      }
      public int find_gcd(int a, int b){
        return b==0?a:find_gcd(b,a%b);
      }
    
}