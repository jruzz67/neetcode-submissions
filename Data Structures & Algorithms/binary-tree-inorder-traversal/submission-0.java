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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorderTraversal(res,root);
        return res;
    }
    public void inorderTraversal(List<Integer> res,TreeNode root){
        if(root==null){
            return;
        }
        inorderTraversal(res,root.left);
        res.add(root.val);
        inorderTraversal(res,root.right);
    }
}