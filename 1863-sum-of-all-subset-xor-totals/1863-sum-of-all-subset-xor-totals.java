class Solution { 
    public int subsetXORSum(int[] nums) { 
        int ans = 0; 
        int n = nums.length;
        // There are 2^n total subsets
        int totalSubsets = 1 << n; 

        // Loop through every possible subset mask
        for (int i = 0; i < totalSubsets; i++) { 
            int currentXor = 0;
            
            // Loop through each element to see if it's included in the current subset
            for (int j = 0; j < n; j++) { 
                // If the j-th bit of mask 'i' is set, include nums[j]
                if ((i & (1 << j)) != 0) {
                    currentXor ^= nums[j];
                }
            }
            // Add the XOR total of the current subset to the final answer
            ans += currentXor; 
        } 
        return ans; 
    } 
}
