class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            int end=n-1;
            while(i<end){
                int area=Math.min(heights[i],heights[end]);
                maxArea=Math.max(maxArea,area*(end-i));
                end--;
            }
        }
        return maxArea;
    }
}
