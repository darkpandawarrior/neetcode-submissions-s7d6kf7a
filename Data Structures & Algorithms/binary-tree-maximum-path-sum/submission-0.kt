/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private var globalMax = Int.MIN_VALUE
    fun maxPathSum(root: TreeNode?): Int {
        if(root == null) return 0
        globalMax = Int.MIN_VALUE
        gainFromNode(root)
        return globalMax
    }

    fun gainFromNode(root: TreeNode?) : Int{
        if(root == null) return 0

        var leftGain = maxOf(gainFromNode(root.left), 0)
        var rightGain = maxOf(gainFromNode(root.right), 0)

        var currentPathSum = root.`val` + leftGain + rightGain
        globalMax = maxOf(globalMax, currentPathSum)

        return root.`val` + maxOf(leftGain, rightGain)
    }

}
