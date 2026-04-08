class Solution {
    fun scoreOfString(s: String): Int {
        var score = 0
        var i = 0
        while(i != s.length -1){
            score += abs(s[i+1] - s[i])
            i++
        }
        return score
    }
}
