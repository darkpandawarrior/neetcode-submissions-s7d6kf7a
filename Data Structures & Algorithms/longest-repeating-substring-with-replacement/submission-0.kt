class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var counts = IntArray(26)
        var left = 0
        var maxFreq = 0
        var maxLength = 0

        for(right in s.indices){
            val charIndex = s[right] - 'A'
            counts[charIndex]++

            maxFreq = maxOf(maxFreq, counts[charIndex])

            if((right - left + 1) - maxFreq > k){
                counts[s[left] - 'A']--
                left++
            }

            maxLength = maxOf(maxLength, right - left +1)
        }

        return maxLength
    }
}
