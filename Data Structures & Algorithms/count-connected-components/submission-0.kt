class Solution {
    fun countComponents(n: Int, edges: Array<IntArray>): Int {
        var parent = IntArray(n) { it }
        var components = n

        fun find(i: Int): Int{
            if(parent[i]== i) return i
            parent[i] = find(parent[i])
            return parent[i]
        }

        fun union(i: Int, j: Int): Boolean{
            var rootI = find(i)
            var rootJ = find(j)
            if(rootI != rootJ){
                parent[rootI] = rootJ
                return true
            }
            return false
        }
        for(edge in edges){
            if(union(edge[0], edge[1])){
                components--
            }
        }
        return components
    }
}
