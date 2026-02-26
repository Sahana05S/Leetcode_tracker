// Last updated: 2/26/2026, 9:04:08 AM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return((coordinates.charAt(0)+coordinates.charAt(1))%2!=0);
    }
}