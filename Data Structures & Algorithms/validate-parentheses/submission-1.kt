class Solution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return false
        
        val parenthesesMap = mapOf(')' to '(', ']' to '[', '}' to '{')
        val backStack = ArrayDeque<Char>()

        for (char in s) {
            if (parenthesesMap.containsKey(char)) {
                if (backStack.lastOrNull() == parenthesesMap[char]) {
                    backStack.removeLast()
                } else {
                    return false
                }
            } else {
                backStack.addLast(char)
            }
        }
        
        return backStack.isEmpty()
    }
}
