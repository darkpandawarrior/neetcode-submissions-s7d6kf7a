class Solution {
    fun countBits(n: Int): IntArray {
        var result = IntArray(n+1)
        for(i in 1..n){
            result[i] = result[i shr 1] + (i and 1)
        }
        return result
    }
}
