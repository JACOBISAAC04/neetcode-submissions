class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxar=0;
        while(l<r){
            int area = (r-l)*Math.min(heights[l],heights[r]);
            maxar = Math.max(maxar,area);
            if(heights[l]<heights[r]){
                l++;
            }
            else if(heights[l]>heights[r]){
                r--;
            }
            else{
                l++;
                r--;
            }
        }
        return maxar;
    }
}
