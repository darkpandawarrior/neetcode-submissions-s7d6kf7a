class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var rows = Array(9) { mutableSetOf<Char>() } 
        var columns = Array(9) { mutableSetOf<Char>() } 
        var boxes  = Array(9) { mutableSetOf<Char>() } 

        for(r in 0 until 9){
            for(c in 0 until 9){
                var char = board[r][c]
                if(char == '.') continue

                val boxIndex = (r/3) * 3 + (c /3)
                if(char in rows[r] || char in columns[c] || char in boxes[boxIndex]) return false

                rows[r].add(char)
                columns[c].add(char)
                boxes[boxIndex].add(char)
            }
        }
        return true
    }
}
