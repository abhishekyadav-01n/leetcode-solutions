class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDiam = diameterOfBinaryTree(root.left);
        int leftheight = height(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightheight = height(root.right);

        int selfDiam = leftheight + rightheight;

        return Math.max(selfDiam, Math.max(leftDiam,rightDiam));
    }
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
}