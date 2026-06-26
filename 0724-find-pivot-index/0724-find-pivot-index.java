class Solution {
    public int pivotIndex(int[] nums) {
         //  1 8 11 17 22 28
        // 28  27  20  17  11  6 
        //  2 3 2 
        //  2 0  -1
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(prefix[i]==suffix[i]) return i;
        }
        return -1;
    }
}