class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length<=1)
        {
            return 0;
        }
        int l=0; 
        int r=nums.length-1;
        while(l<r) { 
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[mid+1]) { 
             r=mid;
            //  ans=mid;
             } 
             else 
             {
               l=mid+1;
             }
            }
            return l;
    }
}
// 0 1 2 3
// 1 2 3 1
// l=0,r=3
// mid=0+(3)/2=1 && mid+1<n
//