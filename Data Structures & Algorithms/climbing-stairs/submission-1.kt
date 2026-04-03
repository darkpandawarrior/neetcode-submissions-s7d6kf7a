class Solution {
    fun climbStairs(n: Int): Int {
        if(n<=2) return n

        var oneStepBefore = 2
        var twoStepBefore = 1
        var allWays = 0

        for(i in 3..n){
            allWays = oneStepBefore + twoStepBefore

            twoStepBefore = oneStepBefore
            oneStepBefore = allWays
        }
        return allWays
    }
}
