/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return validate(root, Int.MIN_VALUE, Int.MAX_VALUE)
    }
    fun validate(root: TreeNode?, minRangeVal: Int, maxRangeVal: Int): Boolean{
        if(root == null) return true
        val currentVal = root.`val`
        
        if(currentVal <= minRangeVal || currentVal >= maxRangeVal) return false

        return validate(root.left, minRangeVal, currentVal) && validate(root.right, currentVal, maxRangeVal)
    }
}
