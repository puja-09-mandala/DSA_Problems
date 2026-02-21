class Solution {
    public boolean isPrime(int n) {
    if (n <= 1) return false;    
    for (int i = 2; i * i <= n; i += 1) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        int res=0;
        for(int i=left;i<=right;i++)
        {
            ans=Integer.bitCount(i);
            if(isPrime(ans))
            {
                res+=1;
            }
            else{
                res+=0;
            }
        }
        return res;
    }
}