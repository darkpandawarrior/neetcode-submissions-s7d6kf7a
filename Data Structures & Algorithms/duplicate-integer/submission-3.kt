class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for(index in nums.indices){
            if (!seen.add(nums[index])) return true
        }
        return false
    }
}
