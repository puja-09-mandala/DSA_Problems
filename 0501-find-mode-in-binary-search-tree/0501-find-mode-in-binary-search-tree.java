class Solution {
    public int[] findMode(TreeNode root) {

        if (root == null) return new int[0];

        HashMap<Integer, Integer> hp = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // Step 1: Count frequency
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();

            hp.put(curr.val, hp.getOrDefault(curr.val, 0) + 1);

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }

        // Step 2: Find max frequency
        int maxx = Integer.MIN_VALUE;
        for (int freq : hp.values()) {
            maxx = Math.max(maxx, freq);
        }

        // Step 3: Collect all modes
        List<Integer> list = new ArrayList<>();
        for (int key : hp.keySet()) {
            if (hp.get(key) == maxx) {
                list.add(key);
            }
        }

        // Step 4: Convert to array
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}