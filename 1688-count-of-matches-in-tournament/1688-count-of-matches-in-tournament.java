class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1)
        {
            if(n%2==0)
            {
                int re=n/2;
                sum+=re;
                n=n-re;
            }
            else
            {
                int re=(n-1)/2;
                sum+=re;
                n=n-re;
            }
        }
        return sum;
    }
}