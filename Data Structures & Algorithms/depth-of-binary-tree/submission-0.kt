/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        var leftNode = maxDepth(root.left)
        var rightNode = maxDepth(root.right)

        return maxOf(leftNode, rightNode) + 1
    }
}
