class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] preProduct=new int[n];
        int[] suProduct=new int[n];
        preProduct[0]=nums[0];
        for(int i=1;i<n;i++){
            preProduct[i]=preProduct[i-1]*nums[i];
        }
        suProduct[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suProduct[i]=suProduct[i+1]*nums[i];
        }
        int[] ans = new int[n];
        for(int j=0;j<n;j++){
            if(j==0)ans[j]=suProduct[j+1];
            else if(j==n-1)ans[j]=preProduct[j-1];
            else ans[j]=preProduct[j-1]*suProduct[j+1];
        }
        return ans;
    }
}  
