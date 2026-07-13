class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0.0;
        double sum=0.0;
     for(int i=0;i<k;i++)
     {
        sum+=nums[i];
     }   
    avg=sum/k;
    double maxx=avg;
    for(int i=k;i<nums.length;i++)
    {
    sum=sum-nums[i-k]+nums[i];
    maxx=Math.max(maxx,sum/k);
    }
    return maxx;
    }
}