class Solution {
    fun minWindow(s: String, t: String): String {
        if(t.length > s.length) return ""
        var countT = mutableMapOf<Char,Int>()
        for(char in t){
            countT[char] = countT.getOrDefault(char, 0)+1
        }
        var window = mutableMapOf<Char,Int>()
        var resIndices = Pair(-1, -1)
        var left = 0
        var have = 0
        var need = countT.size
        var minLength = Int.MAX_VALUE

        for(right in s.indices){
            val rightChar = s[right]
            window[rightChar] = window.getOrDefault(rightChar, 0) +1

            if(rightChar in countT && window[rightChar] == countT[rightChar]){
                have++
            }

            while(have == need){
                if(right - left + 1 < minLength){
                    minLength = right - left + 1
                    resIndices = Pair(left, right)
                }

                var leftChar = s[left]
                window[leftChar] = window[leftChar]!! -1

                if(leftChar in countT && window[leftChar]!! < countT[leftChar]!!){
                    have--
                }
                left++
            }
        }
        return if(minLength == Int.MAX_VALUE) "" else s.substring(resIndices.first, resIndices.second + 1)
    }
}
