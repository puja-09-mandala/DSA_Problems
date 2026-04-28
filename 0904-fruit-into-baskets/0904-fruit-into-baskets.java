class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        int left=0;
        int maxlen=0;
        for(int i=0;i<fruits.length;i++)
        {
            hp.put(fruits[i],hp.getOrDefault(fruits[i],0)+1);
            while(hp.size()>2)
            {
                int fruit=fruits[left];
                hp.put(fruits[left],hp.get(fruits[left])-1);
                if(hp.get(fruit)==0)
                {
                    hp.remove(fruit);
                }
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}