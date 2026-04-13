class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        int count=0;
        int left=0;
      for(int i=0;i<nums.length;i++)
      {
        sum+=nums[i];
        while(sum>=target)
        {
                 minlen=Math.min(minlen,i-left+1);
            sum-=nums[left];
            left++;
        
        }
      }  
      if(minlen==Integer.MAX_VALUE)
      {
        return 0;
      }
      return minlen;
    }
}