class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()<goal.length())
        {
            return false;
        }
        if(goal.length()<s.length())
        {
            return false;
        }
          String combined = s + s;
        return combined.contains(goal);
    }
}