class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
       HashMap<Character,Integer>hp=new HashMap<>();
       HashMap<Character,Integer>hp1=new HashMap<>();
       if(p.length()>s.length())
       {
        return list;
       }
       char arr[]=s.toCharArray();
        for(int i=0;i<p.length();i++)
        {
            hp1.put(p.charAt(i),hp1.getOrDefault(p.charAt(i),0)+1);
        }
        for(int i=0;i<p.length();i++)
        {
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
            if(hp.equals(hp1))
            {
                list.add(0);
            }
        }
        for(int i=p.length();i<s.length();i++)
        {
        hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
            char old = arr[i - p.length()];
            hp.put(old, hp.get(old) - 1);
            if(hp.get(old) == 0) {
                hp.remove(old);
            }
            if(hp.equals(hp1))
            {
                list.add(i-p.length()+1);
            }
        }
        return list;
    }
}