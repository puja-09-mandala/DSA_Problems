/**
 * @param {number} n
 * @return {number}
 */
 var check=function(n)
 {  
    let sum=0;
 while(n!=0)
 {
    let digit=n%10;
    sum+=digit;
    n=Math.floor(n/10);
 }
 return sum;
 };
var digitFrequencyScore = function(n) {
    let ans=check(n);
    return ans;
};