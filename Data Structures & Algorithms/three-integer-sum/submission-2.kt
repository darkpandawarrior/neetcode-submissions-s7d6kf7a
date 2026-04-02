class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var sortNums = nums.sorted()
        var result = mutableListOf<MutableList<Int>>()
        for(i in 0..sortNums.size-3){
            if(sortNums[i] > 0) break
            if(i > 0 && sortNums[i] == sortNums[i-1]) continue
            var left = i + 1
            var right = sortNums.size -1
            while (left < right){
                val lhs = sortNums[left] + sortNums[right]
                val rhs = -1 * sortNums[i]
                if(lhs < rhs){
                    left++
                } else if (lhs > rhs){
                    right--
                } else {
                    result.add(mutableListOf(sortNums[i], sortNums[left], sortNums[right]))
                    left++
                    right--
                    while (left < right && sortNums[left] == sortNums[left - 1]) {
                        left++
                    }
                    while (left < right && sortNums[right] == sortNums[right + 1]) {
                        right--
                    }
                }
            }
        }
        return result
    }
}
