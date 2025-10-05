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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

   public void preorder(TreeNode root, List<Integer> arr) {
        // If the current node is NULL
        // (base case for recursion), return
        if (root == null) {
            return;
        }
        // Push the current node's
        // value into the list
        arr.add(root.val);
        // Recursively traverse
        // the left subtree
        preorder(root.left, arr);
        // Recursively traverse
        // the right subtree
        preorder(root.right, arr);
    }


}
