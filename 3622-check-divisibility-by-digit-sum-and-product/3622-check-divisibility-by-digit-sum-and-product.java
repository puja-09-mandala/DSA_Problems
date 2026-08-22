class Solution {
    public int digits(int n)
    {
        int sum=0;
        int prod=1;
        while(n!=0)
        {
            int digit=n%10;
            sum+=digit;
            prod=prod*digit;
            n=n/10;
        }
        return sum+prod;
    }
    public boolean checkDivisibility(int n) {
        int ans=digits(n);
     if(n%(ans)==0)
     return true;
     return false;   

    }
}