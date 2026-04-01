/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        var inOrderMap = HashMap<Int, Int>()
        for(indice in inorder.indices){
            inOrderMap[inorder[indice]] = indice
        }
        fun splitTree(preStart: Int, inStart: Int, inEnd: Int): TreeNode? {
            if (inStart > inEnd) return null

            val rootValue = preorder[preStart]
            val root = TreeNode(rootValue)
        
            val pivot = inOrderMap[rootValue]!!
        
            val leftNodesCount = pivot - inStart

            root.left = splitTree(preStart + 1, inStart, pivot -1)
            root.right = splitTree(preStart + leftNodesCount + 1, pivot +1, inEnd)

            return root
        }
        return splitTree(0, 0, inorder.size -1)
    }
}
