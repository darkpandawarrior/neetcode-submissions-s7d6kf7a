class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        var map1 = HashMap<Char, Int>()
        var map2 = HashMap<Char, Int>()
        for((index, value) in s.withIndex()){
            if(map1.contains(value)){
                map1[value] = map1.getOrDefault(value, 0) + 1
            } else {
                map1[value] = 1
            }
        }
        for((index, value) in t.withIndex()){
            if(map2.contains(value)){
                map2[value] = map2.getOrDefault(value, 0) + 1
            } else {
                map2[value] = 1
            }
        }
        return map1 == map2
    }
}
