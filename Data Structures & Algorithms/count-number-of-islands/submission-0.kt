class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        if(grid.isEmpty()) return 0
        var count = 0
        for(r in grid.indices){
            for(c in grid[0].indices){
                if(grid[r][c] == '1'){
                    count++
                    sinkIsland(grid, r, c)
                }
            }
        }
        return count
    }
    fun sinkIsland(grid: Array<CharArray>, r: Int, c: Int){
        if(r !in grid.indices || c !in grid[0].indices || grid[r][c] == '0') return

        grid[r][c] = '0'

        sinkIsland(grid, r+1, c)
        sinkIsland(grid, r-1, c)
        sinkIsland(grid, r, c+1)
        sinkIsland(grid, r, c-1)
    }
}
