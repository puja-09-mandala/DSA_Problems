class Solution {
           List<Integer>list=new ArrayList<>();
           public void check(int num)
           {
             List<Integer> temp = new ArrayList<>();
        while(num != 0) {
            int digit = num % 10;
            temp.add(digit);
            num = num / 10;
        }
        for(int i = temp.size() - 1; i >= 0; i--) {
            list.add(temp.get(i));
        }
           }
    public int[] separateDigits(int[] nums) {
        for(int i:nums)
        {
           check(i);
        }
           int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}