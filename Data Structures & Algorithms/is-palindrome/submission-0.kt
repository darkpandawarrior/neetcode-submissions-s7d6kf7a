class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0;
        var j = s.length - 1
        if(s.length == 1) return true
        while(i < j){
            while (i < j && !s[i].isLetterOrDigit()){
                i++
            }
            while (i < j && !s[j].isLetterOrDigit()){
                j--
            }
            if (s[i].lowercaseChar() != s[j].lowercaseChar()){
                return false
            }
            i++
            j--
        }
        return true
    }
}
