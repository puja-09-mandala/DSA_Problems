/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   public List<Integer> pre(Node root, List<Integer> child) {
        if (root == null) {
            return child;
        }

        child.add(root.val);
        if (root.children != null) {
            for (Node i : root.children) {
                pre(i, child);
            }
        }
        return child;
    }
    public List<Integer> preorder(Node root) {
     return pre(root,new ArrayList<>());   
    }
}