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

class Diameter_Binary_Tree {
    int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }
    
    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);
        
        // Update diameter: sum of left and right heights
        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        // Return height of current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
