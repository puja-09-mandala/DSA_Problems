class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hp.containsKey(target-nums[i]))
            {
                ans[0]=hp.get(target-nums[i]);
                ans[1]=i;
            }
            hp.put(nums[i],i);
        }
        return ans;
    }
}