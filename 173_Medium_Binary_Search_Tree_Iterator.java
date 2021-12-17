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
    ArrayList<Integer> inorder;
    int current;
    public BSTIterator(TreeNode root) {
        this.inorder = new ArrayList<Integer>();
        this.doInOrder(root);
        this.current = -1;
    }
    
    public void doInOrder(TreeNode root){
        if(root==null) return;
        doInOrder(root.left);
        inorder.add(root.val);
        doInOrder(root.right);
    }
    
    public int next() {
        return inorder.get(++current);
    }
    
    public boolean hasNext() {
        
        return this.current+1<inorder.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */