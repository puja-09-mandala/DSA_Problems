class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        int left=0;
        int sum=0;
        int maxsum=0;
        for(int i=0;i<nums.length;i++)
        {
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
             sum+=nums[i];
            while(hp.get(nums[i])>1)
            {
                int freq=hp.get(nums[left]);
               hp.put(nums[left],hp.get(nums[left])-1);
                 sum-=nums[left]; 
                if(freq==0)
                {
                    hp.remove(nums[left]);
                }
                left++;
            }
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}