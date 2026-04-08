import java.util.*;

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        int n = descriptions.length;
        for(int i = 0; i < n; i++) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            int isLeft = descriptions[i][2];
            map.putIfAbsent(parent, new TreeNode(parent));
            map.putIfAbsent(child, new TreeNode(child)); 
            TreeNode parentNode = map.get(parent);
            TreeNode childNode = map.get(child);
            if(isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
            children.add(child);
        }
        for(int key : map.keySet()) {
            if(!children.contains(key)) {
                return map.get(key);
            }
        }
        return null;
    }
}