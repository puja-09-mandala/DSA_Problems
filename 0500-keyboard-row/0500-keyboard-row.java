class Solution {
    public boolean  check(String str1,String str)
    {
        str1=str1.toLowerCase();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str1.indexOf(str.charAt(i)) == -1)
            {
                return false;
            }
        }
        return true;
    }
    public String[] findWords(String[] words) {
        String ans[]=new String[words.length];
        int idx=0;
    for(int i=0;i<words.length;i++)
    {
        String str=words[i];
        if(check("qwertyuiop",str)|| check("asdfghjkl",str) || check("zxcvbnm",str))
        {   
            ans[idx++]=str;
        }
    }
    return Arrays.copyOf(ans,idx);
    }
}