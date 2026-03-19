class Solution {
    public TreeNode build(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        int[] left = new int[index];
        for (int i = 0; i < index; i++) {
            left[i] = nums[i];
        }
        int[] right = new int[nums.length - index - 1];
        for (int i = index + 1; i < nums.length; i++) {
            right[i - index - 1] = nums[i];
        }
        root.left = build(left);
        root.right = build(right);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums);
    }
}