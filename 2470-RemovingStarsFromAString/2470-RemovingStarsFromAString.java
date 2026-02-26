// Last updated: 2/26/2026, 9:03:38 AM
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        char[] carr=s.toCharArray();
        for(char c:carr){
            if(c!='*')  stack.push(c);
            else if(c=='*') stack.pop();
           
        }
        if (s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {   
             sb.append(ch);
        }
        String result = sb.toString();
        return result;
    }
}