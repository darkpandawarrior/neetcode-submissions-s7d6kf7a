/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if(root == null) return null
        
        val rootVal = root.`val`
        val pVal = p!!.`val`
        val qVal = q!!.`val`

        return when {
            pVal > rootVal && qVal > rootVal -> {
                lowestCommonAncestor(root.right, p, q)
            }
            pVal < rootVal && qVal < rootVal -> {
                lowestCommonAncestor(root.left, p, q)
            }
            else -> root
            }
        }
}
