class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double res=sum/k;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i];
            sum-=nums[i-k];
            double ans=(double)(sum)/k;
            res=Math.max(ans,res);
        }
        return res;
    }
}