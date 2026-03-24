class Solution {
    static class Pair {
        TreeNode node;
        int row, col;
        Pair(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        // col → (row → list of values)
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair p = q.remove();

            int row = p.row;
            int col = p.col;
            TreeNode node = p.node;
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).add(node.val);
            if (node.left != null) {
                q.add(new Pair(node.left, row + 1, col - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, row + 1, col + 1));
            }
        }
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> list = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }

            res.add(list);
        }

        return res;
    }
}