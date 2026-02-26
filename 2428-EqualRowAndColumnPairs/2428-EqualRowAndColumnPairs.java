// Last updated: 2/26/2026, 9:03:43 AM
import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String,Integer> rowCount = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            for (int j = 0; j < n; j++) {
                if (j > 0) sb.append(',');
                sb.append(grid[i][j]);
            }
            String key = sb.toString();
            rowCount.put(key, rowCount.getOrDefault(key, 0) + 1);
        }
        int ans = 0;
        for (int j = 0; j < n; j++) {
            sb.setLength(0);
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(',');
                sb.append(grid[i][j]);
            }
            String key = sb.toString();
            ans += rowCount.getOrDefault(key, 0);
        }
        return ans;
    }
}
