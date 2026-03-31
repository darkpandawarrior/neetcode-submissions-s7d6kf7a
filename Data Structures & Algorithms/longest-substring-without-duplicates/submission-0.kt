class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty()) return 0
        val lastSeenColumn = IntArray(128) { 0 }
        var left = 0
        var maxLength = 0
        for(right in s.indices){
            val charCode = s[right].code
            
            left = maxOf(left, lastSeenColumn[charCode])
            
            maxLength = maxOf(maxLength, right - left + 1)
            
            lastSeenColumn[charCode] = right + 1
        }
        return maxLength
    }
}
