class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer ans[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
        }
        Arrays.sort(ans,(a,b)->
        {
            if(a%2==0 || b%2!=0)
            {
                return -1;
            }
             if (a % 2 != 0 && b % 2 == 0) return 1;
            
            return 0;
        });
        for(int i=0;i<ans.length;i++)
        {
            nums[i]=ans[i];
        }
        return nums;
    }
}