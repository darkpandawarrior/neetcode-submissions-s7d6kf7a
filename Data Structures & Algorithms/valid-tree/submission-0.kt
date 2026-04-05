class Solution {
    fun validTree(n: Int, edges: Array<IntArray>): Boolean {
        if(edges.size != n-1) return false

        var parent = IntArray(n){it}
        var components = n

        fun find(i:Int):Int{
            if(parent[i] == i) return i
            parent[i] = find(parent[i])
            return parent[i]
        }

        fun union(i: Int, j: Int): Boolean{
            var rootI = find(i)
            var rootJ = find(j)
            if(rootI == rootJ){
                return false
            }
            parent[rootI] = rootJ
            return true
        }

        for(edge in edges){
            if(!union(edge[0], edge[1])) return false
            components--
        }

        return components == 1
    }
}
