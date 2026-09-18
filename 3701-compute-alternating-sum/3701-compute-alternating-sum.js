/**
 * @param {number[]} nums
 * @return {number}
 */
var alternatingSum = function(nums) {
    let sum=0;
    let sum1=0;
    for(let i=0;i<nums.length;i++)
    {
        if(i%2==0) sum+=nums[i];
        else sum1+=nums[i];
    }
    return sum-sum1;
};