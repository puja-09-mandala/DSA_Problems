/**
 * @param {string} s
 * @return {number}
 */
var reverseDegree = function(s) {
    let ans=0;
   for(let i = 0; i < s.length; i++) {
        let ch = s.charCodeAt(i) - 96;
        ans += (27 - ch) * (i + 1);
    }

    return ans;
};