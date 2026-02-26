// Last updated: 2/26/2026, 9:04:52 AM
class Solution {
    public int fib(int n) {
         int a=0,b=1,temp=0;
        if(n<=1)
            return n;
       
           
        for(int i=2;i<=n;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return temp;
            
    }
}
