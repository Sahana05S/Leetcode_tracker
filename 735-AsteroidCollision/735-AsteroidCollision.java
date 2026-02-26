// Last updated: 2/26/2026, 9:05:16 AM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
            for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                boolean alive = true;
                
                while (!stack.isEmpty() && stack.peek() > 0) {
                    if (Math.abs(a) > stack.peek()) {
                        stack.pop();
                        continue;
                    } else if (Math.abs(a) == stack.peek()) {
                        stack.pop(); 
                        alive = false;
                        break;
                    } else {
                        alive = false; 
                        break;
                    }
                }
                
                if (alive) {
                    stack.push(a);
                }
            }
        }
        int[] result=new int[stack.size()];
        int i=0;
        for(int num:stack){
            result[i++]=num;
        }
        return result;
    }
}