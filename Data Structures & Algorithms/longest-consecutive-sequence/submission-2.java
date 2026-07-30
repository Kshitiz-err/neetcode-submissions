class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==1||n==0)return n;
        Arrays.sort(nums);
        int ans=1,max=1;
        //System.out.println(Arrays.toString(nums));
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>1){
                max=Math.max(max,ans);
                ans=1;
            }else if(nums[i]-nums[i-1]==1){
                ans++;
                //System.out.println(nums[i]+"  "+nums[i-1]+"   "+ans);
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}
