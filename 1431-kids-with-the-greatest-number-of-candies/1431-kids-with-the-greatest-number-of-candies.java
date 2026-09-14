class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean>list=new ArrayList<>();
     int maxx=0;
     for(int i:candies)
     {
        maxx=Math.max(maxx,i);
     }
     for(int i=0;i<candies.length;i++)
     {
        // boolean is=false;
        int ans=candies[i]+extraCandies;
        if(ans>=maxx)
        {
       list.add(true);
        }
        else
        list.add(false);
     }   
     return list;
    }
}