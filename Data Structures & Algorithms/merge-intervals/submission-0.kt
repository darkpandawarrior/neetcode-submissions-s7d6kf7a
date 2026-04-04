class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.isEmpty()) return emptyArray()

        intervals.sortBy { it[0] }

        val result = mutableListOf<IntArray>()
        result.add(intervals[0])

        for(i in 1 until intervals.size){
            var lastMerged = result.last()
            var current = intervals[i]

            if(current[0] <= lastMerged[1]){
                lastMerged[1] = maxOf(lastMerged[1], current[1])
            } else {
                result.add(current)
            }
        }
        return result.toTypedArray()
    }
}
