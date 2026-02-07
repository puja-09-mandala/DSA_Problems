class Solution {
    public int binary(int n)
    {
        int temp = n;
    int count = 0;
    while (temp > 0) {
        if (temp % 2 == 1) {
            count++;
        }
        temp = temp / 2;
    }
    return count;
    }
    public int hammingWeight(int n) {
        int ans=binary(n);
        return ans;
    }
}