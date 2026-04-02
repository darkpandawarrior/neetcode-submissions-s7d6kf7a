class Solution {
    fun isValid(s: String): Boolean {
        if(s.isEmpty()) return false
        val parenthesesMap = mapOf(')' to '(', ']' to '[', '}' to '{')
        var backStack = ArrayDeque<Char>()
        for(indice in s.indices){
            if(s[indice] == '(' || s[indice] == '{' || s[indice] == '['){
                backStack.addLast(s[indice])
            } else {
                if(backStack.isNotEmpty()){
                    val isValid = backStack.lastOrNull() == parenthesesMap[s[indice]]
                    if(isValid){
                        backStack.removeLast()
                    } else {
                        return false
                    }
                } else {
                    return false
                }
            }
        }
        return backStack.isEmpty()
    }
}
