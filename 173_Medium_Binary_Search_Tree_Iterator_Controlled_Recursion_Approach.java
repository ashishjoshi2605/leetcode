/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    Deque<TreeNode> recursionStack;
    public BSTIterator(TreeNode root) {
        recursionStack = new ArrayDeque<TreeNode>();
        _leftmostInorder(root);
    }
    private void _leftmostInorder(TreeNode root){
        while(root!=null){
            recursionStack.push(root);
            root=root.left;
        }
    }
    
    public int next() {
        TreeNode temp = recursionStack.pop();
        if(temp.right!=null){
            _leftmostInorder(temp.right);
        }
        return temp.val;
    }
    
    public boolean hasNext() {
        return recursionStack.size()>0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */