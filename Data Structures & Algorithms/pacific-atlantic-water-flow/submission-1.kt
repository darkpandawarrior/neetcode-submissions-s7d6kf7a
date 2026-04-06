class Solution {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        if(heights.isEmpty()) return emptyList()
        var rows = heights.size
        var col = heights[0].size
        var pacific = Array(rows) { BooleanArray(col)}
        var atlantic = Array(rows) { BooleanArray(col)}

        for(c in 0 until col){
            dfs(0, c, heights, pacific, heights[0][c])
            dfs(rows-1, c, heights, atlantic, heights[rows-1][c])
        }
        for(r in 0 until rows){
            dfs(r, 0, heights, pacific, heights[r][0])
            dfs(r, col-1, heights, atlantic, heights[r][col-1])
        }

        var result = mutableListOf<List<Int>>()
        for(r in 0 until rows){
            for(c in 0 until col){
                if(pacific[r][c] && atlantic[r][c]){
                    result.add(listOf(r, c))
                }
            }
        }
        return result

    }
    fun dfs(r: Int, c: Int, heights: Array<IntArray>, visited: Array<BooleanArray>, prevHeight: Int){
        var rows = heights.size
        var col = heights[0].size

        if(r !in 0 until rows || c !in 0 until col || visited[r][c] || heights[r][c] < prevHeight){
            return
        }

        visited[r][c] = true

        dfs(r-1, c, heights, visited, heights[r][c])
        dfs(r+1, c, heights, visited, heights[r][c])
        dfs(r, c+1, heights, visited, heights[r][c])
        dfs(r, c-1, heights, visited, heights[r][c])
    }
}
