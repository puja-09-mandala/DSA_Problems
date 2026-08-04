class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>res=new ArrayList<>();
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        for(int i: nums)
    {
        minn=Math.min(minn,i);
        maxx=Math.max(maxx,i);
        res.add(i);
    }
    List<Integer>ans=new ArrayList<>();
    for(int i=minn;i<=maxx;i++)
    {
        if(!res.contains(i))
        {
            ans.add(i);
        }
    }
    return ans;
    }
}