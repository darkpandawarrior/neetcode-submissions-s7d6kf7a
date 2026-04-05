/*
Definition for a Node.
class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}
*/

class Solution {
    private var visited = HashMap<Node, Node>()
    fun cloneGraph(node: Node?): Node? {
        if(node == null) return null

        if(visited.contains(node)){
            return visited[node]
        }

        var clone = Node(node.`val`)

        visited[node] = clone

        for(neighbor in node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor))
        }

        return clone
    }
}
