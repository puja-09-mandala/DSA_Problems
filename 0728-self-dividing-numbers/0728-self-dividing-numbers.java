class Solution {
      List<Integer>list1=new ArrayList<>();
    public boolean  check(int num)
    {
        list1.clear();
        int temp=num;
        while(temp!=0)
        {
            int digit=temp%10;
            if(digit==0)
            {
                 return false;
            }
            list1.add(digit);
            temp=temp/10;
        }
        for(int i=0;i<list1.size();i++)
        {
            if(num%(list1.get(i))!=0)
            {
                return false;
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(check(i))
            {
                list.add(i);
            }
        }
        return list;
    }
}