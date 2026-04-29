class Solution {
    List<List<Integer>>list=new ArrayList<>();
    public void subsequence(int arr[],int idx,List<Integer>ans)
    {
         if(idx==arr.length)
        {
           list.add(new ArrayList<>(ans));
            return ;
        }
        ans.add(arr[idx]);
        subsequence(arr,idx+1,ans);
        ans.remove(ans.size()-1);
        subsequence(arr,idx+1,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<Integer>ans=new ArrayList<>();
       subsequence(nums,0,ans);
       return list;
    }
}