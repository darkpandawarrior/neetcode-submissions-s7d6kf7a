class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = nums.toHashSet()
        return set.size != nums.size
    }
}
