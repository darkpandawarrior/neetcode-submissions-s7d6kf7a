class Solution {
    fun getSum(a: Int, b: Int): Int {
        var tempA = a
        var tempB = b
        while(tempB != 0){
            var sum = tempA xor tempB
            var carry = (tempA and tempB) shl 1
            tempA = sum
            tempB = carry
        }
        return tempA
    }
}
