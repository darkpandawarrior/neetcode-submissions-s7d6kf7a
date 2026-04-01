/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private var count = 0;
    private var result = -1;
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        traverse(root, k)
        return result
    }
    fun traverse(root: TreeNode?, k: Int){
        if(root == null || result != -1) return

        traverse(root.left, k)
        count++
        if(count == k){
            result = root.`val`
            return
        }
        traverse(root.right, k)
        return
    }
}
