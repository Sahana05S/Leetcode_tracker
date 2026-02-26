// Last updated: 2/26/2026, 9:03:23 AM
class Solution {
    public int passThePillow(int n, int time) {
        int turn = ((n-1)*2);
        time%=turn;
        if(time<n) return time+1;
        else return (turn-time+1);
    }
}