class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>hp=new HashMap<>();
       HashMap<Character,Integer>hp1=new HashMap<>();
       if(s1.length()>s2.length())
       {
        return false;
       }
       char arr[]=s2.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            hp1.put(s1.charAt(i),hp1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s1.length();i++)
        {
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
            if(hp.equals(hp1))
            {
              return true;
            }
        }
        for(int i=s1.length();i<s2.length();i++)
        {
        hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
            char old = arr[i - s1.length()];
            hp.put(old, hp.get(old) - 1);
            if(hp.get(old) == 0) {
                hp.remove(old);
            }
            if(hp.equals(hp1))
            {
                return true;
            }
        }
        return false;
    }
}