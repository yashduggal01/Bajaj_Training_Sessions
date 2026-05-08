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

class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        
        // Current node value must be within (min, max)
        if (node.val <= min || node.val >= max) {
            return false;
        }
        
        // Left subtree: values must be less than current node
        // Right subtree: values must be greater than current node
        return validate(node.left, min, node.val) && 
               validate(node.right, node.val, max);
    }
}
