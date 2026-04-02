class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var frequencyMap = HashMap<Int, Int>()
        nums.forEach { frequencyMap[it] = frequencyMap.getOrDefault(it, 0) + 1 }
        var buckets = Array(nums.size + 1) { mutableListOf<Int>() }
        var result = IntArray(k)
        for ((num, frequency) in frequencyMap){
            buckets[frequency].add(num)
        }
        var count = 0
        for (i in buckets.size - 1 downTo 0) {
            for (element in buckets[i]) {
                result[count] = element
                count++
                if (count == k) return result
            }
        }
        return result
    }
}
