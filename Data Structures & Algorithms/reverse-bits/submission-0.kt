class Solution {
    fun reverseBits(n: Int): Int {
        var result = 0
        var num = n
        for(i in 1..32){
            result = result shl 1
            result = result or (num and 1)
            num = num ushr 1
        }
        return result
    }
}
