class ArrayWrapper {
    /**
     * @param {number[]} nums
     */
    constructor(nums) {
        this.nums = nums;
    }

    /**
     * @return {number}
     */
    valueOf() {
        // Sums up all the numbers in the array. Returns 0 if empty.
        return this.nums.reduce((sum, num) => sum + num, 0);
    }

    /**
     * @return {string}
     */
    toString() {
        // Joins array elements with a comma and wraps them in brackets.
        return `[${this.nums.join(',')}]`;
    }
}
