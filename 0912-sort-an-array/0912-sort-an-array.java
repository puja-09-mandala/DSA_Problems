class Solution {
    public int[] sortArray(int[] nums) {
      Integer arr[]=new Integer[nums.length];
      for(int i=0;i<nums.length;i++)
    {
        arr[i]=nums[i];
    }
        Arrays.sort(arr,(a,b)->
        {
        return a-b;
        });
    for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}