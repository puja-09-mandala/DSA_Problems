class Solution {
    public static String binary(int ans,int n)
    {
        StringBuilder sb=new StringBuilder();

        while(ans>0)
        {
            sb.append(ans%2);
            ans=ans/2;
        }

        while(sb.length()<n)
            sb.append("0");

        return sb.reverse().toString();
    }
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;

        HashSet<Integer> set=new HashSet<>();

        for(String s:nums)
        {
            set.add(Integer.parseInt(s,2));
        }
        for(int i=0;i<(1<<n);i++)
        {
            if(!set.contains(i))
            {
                return binary(i,n);
            }
        }
        return "";
    }
}