var firstPalindrome = function(words) {
    function check(ans) {
        let left = 0;
        let right = ans.length - 1;
        while (left < right) {
            if (ans[left] !== ans[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    for (let i = 0; i < words.length; i++) {
        let ans = words[i];
        if (check(ans)) {
            return ans;
        }
    }
    return "";
};