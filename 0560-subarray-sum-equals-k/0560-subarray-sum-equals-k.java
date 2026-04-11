class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer>hp=new HashMap<>();
        hp.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hp.containsKey(sum-k))
            {
                count+=hp.get(sum-k);
            }
            hp.put(sum,hp.getOrDefault(sum,0)+1);
        }   
        return count;
    }
}