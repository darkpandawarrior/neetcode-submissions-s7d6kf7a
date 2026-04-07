class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        var ans = IntArray(2*n)
        for(i in nums.indices){
            ans[i] = nums[i]
            ans[i+n] = nums[i]
        }
        return ans
    }
}
