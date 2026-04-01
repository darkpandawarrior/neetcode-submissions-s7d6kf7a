/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)
        while(queue.isNotEmpty()){
            var current = queue.removeFirst()
            val temp = current.left
            current.left = current.right
            current.right = temp

            if(current.left != null) queue.add(current.left)
            if(current.right != null) queue.add(current.right)
        }
        return root

    }
}
