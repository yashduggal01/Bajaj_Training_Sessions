import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Two_Sum_IV_BST {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return dfs(root, k, set);
    }
    
    private boolean dfs(TreeNode node, int k, Set<Integer> set) {
        if (node == null) {
            return false;
        }
        
        // Check if complement exists in set
        if (set.contains(k - node.val)) {
            return true;
        }
        
        // Add current value to set
        set.add(node.val);
        
        // Check left and right subtrees
        return dfs(node.left, k, set) || dfs(node.right, k, set);
    }
}
