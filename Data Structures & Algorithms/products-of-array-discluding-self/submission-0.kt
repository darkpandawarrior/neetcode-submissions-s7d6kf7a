class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        var output = IntArray(size)
        output[0] = 1
        for(i in 1 until size){
            output[i] = output[i-1] * nums[i-1]
        }
        var suffix = 1
        for(i in size-1 downTo 0){
            output[i] = output[i] * suffix
            suffix = suffix * nums[i]
        }
        return output
    }
}
