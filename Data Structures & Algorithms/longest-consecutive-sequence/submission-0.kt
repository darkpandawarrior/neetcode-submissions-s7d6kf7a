class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var uniqueSet = nums.toHashSet()
        var maxSequenceLength = 0
        for (num in uniqueSet){
            if(uniqueSet.contains(num-1)) continue
            var currentSequenceLength = 1
            while(uniqueSet.contains(num + currentSequenceLength)){
                currentSequenceLength++
            }
            maxSequenceLength = maxOf(maxSequenceLength, currentSequenceLength)
        }
        return maxSequenceLength
    }
}
