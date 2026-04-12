class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int count=0;
        int left=0;
        if(k <= 1) return 0;
        for(int i=0;i<nums.length;i++)
        {
            prod*=nums[i];
          while(prod>=k)
          {
            prod=prod/nums[left];
            left++;
          }
          count+=(i-left+1);
        }
        return count;
    }
}