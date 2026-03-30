class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if(strs.isEmpty()) return emptyList()
        var finalMap = mutableMapOf<String, MutableList<String>>()
        for(str in strs){
            var s = str.toCharArray().sortedArray().joinToString("")
            finalMap.getOrPut(s) { mutableListOf() }.add(str)
        }
        return finalMap.values.toList()
    }
}
