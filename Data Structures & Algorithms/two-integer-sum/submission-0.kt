class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = HashMap<Int, Int>()
        var result = intArrayOf()
        for(indice in nums.indices){
            if(map.contains(target - nums[indice])){
                result = intArrayOf(map[target - nums[indice]]!!, indice)
                break
            }
            map[nums[indice]] = indice
        }
        return result
    }
}
