class Solution {
    public int helper(int nums[], int i, int end) {
        int dp[] = new int[nums.length-1];
        dp[0] = nums[i];
        dp[1] = Math.max(nums[i], nums[i + 1]);
        for (int k = i + 2, j = 2; k <= end; k++, j++) {
            dp[j] = Math.max(dp[j - 1], dp[j - 2] + nums[k]);
        }
        return dp[nums.length - 2];
    }

    public int rob(int[] nums) {
      if(nums.length==1)
        return nums[0];
     if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
    }
}