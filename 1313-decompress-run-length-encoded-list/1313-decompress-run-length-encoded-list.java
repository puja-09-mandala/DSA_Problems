import java.util.Arrays;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        // Step 1: Calculate the total length of the decompressed array
        int totalLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalLength += nums[i];
        }
        
        // Create the result array with the exact size needed
        int[] result = new int[totalLength];
        
        // Step 2: Fill the result array based on freq and val
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            
            // Fill the 'val' into 'result' array 'freq' times
            Arrays.fill(result, currentIndex, currentIndex + freq, val);
            currentIndex += freq;
        }
        
        return result;
    }
}
