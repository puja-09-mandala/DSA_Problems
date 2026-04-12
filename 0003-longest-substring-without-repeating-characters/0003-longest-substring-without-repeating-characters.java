class Solution {
    public int lengthOfLongestSubstring(String s) {
            HashSet<Character>hs=new HashSet<>();
            int left=0;
            int maxlen=0;
            for(int i=0;i<s.length();i++)
            {
               while(hs.contains(s.charAt(i)))
               {
                hs.remove(s.charAt(left));
                left++;
               }
               hs.add(s.charAt(i));
                maxlen=Math.max(maxlen,hs.size());
            }
            return maxlen;
    }
}