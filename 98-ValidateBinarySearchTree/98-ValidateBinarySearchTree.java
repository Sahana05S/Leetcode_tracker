// Last updated: 2/26/2026, 9:57:14 AM
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
    public boolean isValidBST(TreeNode root) {
        return ValidateBST(root,null,null);
    }
    private boolean ValidateBST(TreeNode node, Integer low, Integer high){
        if(node==null) return true;
        if(high!=null && node.val>=high) return false;
        if(low!=null && node.val<=low) return false;
        return ValidateBST(node.left,low,node.val) && ValidateBST(node.right,node.val,high); 
    }
}