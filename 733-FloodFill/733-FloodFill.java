// Last updated: 2/26/2026, 9:05:17 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgCol=image[sr][sc];
        if(orgCol==color) return image;
        dfs(image,sr,sc,orgCol,color);
        return image;
    }
    public static void dfs(int[][] image,int r,int c,int orgCol,int color){
        if(r<0 || r>=image.length || c<0 || c>=image[0].length) return;
        if(image[r][c]!=orgCol) return;
        image[r][c]=color;
        dfs(image,r-1,c,orgCol,color);
        dfs(image,r+1,c,orgCol,color);   
        dfs(image,r,c-1,orgCol,color);
    dfs(image,r,c+1,orgCol,color);     
    }
}