class Solution {
    public boolean isPrime(int n) {
    if (n <= 1) return false;   
    if (n == 2) return true;   
    if (n % 2 == 0) return false;  
    for (int i = 3; i * i <= n; i += 2) {
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