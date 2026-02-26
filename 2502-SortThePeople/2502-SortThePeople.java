// Last updated: 2/26/2026, 9:03:35 AM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length-1;i++){
            for(int j=0;j<heights.length-1-i;j++){
                if(heights[j]<heights[j+1]){
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;

                    String tName=names[j];
                    names[j]=names[j+1];
                    names[j+1]=tName;
                }

             
            }
        
        }
     return names;
    }
}