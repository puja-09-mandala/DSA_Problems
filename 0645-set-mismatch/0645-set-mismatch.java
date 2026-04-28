class Solution {
    public int[] findErrorNums(int[] nums) {
            HashMap<Integer,Integer>hp=new HashMap<>();
            int ans[]=new int[2];
            for(int i=0;i<nums.length;i++)
            {
                hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
                if(hp.get(nums[i])==2)
                {
                    ans[0]=nums[i];
                }
            }
           for (int i = 1; i <= nums.length; i++) {
            if (!hp.containsKey(i)) {
                ans[1] = i;
                break;
            }
        }
            return ans;
    }
}