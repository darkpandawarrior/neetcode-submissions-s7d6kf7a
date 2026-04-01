class Solution {
    fun hammingWeight(n: Int): Int {
        var count = 0
        var temp = n
        while(temp != 0){
            temp = temp and (temp -1)
            count++
        }
        return count
    }
}
