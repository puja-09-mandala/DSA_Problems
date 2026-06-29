class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++)
        {
         int ans=letters[i]-'0';
            if(ans>target-'0')
            {
                return letters[i];
            }
        }
        return letters[0];
    }
}