class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        var result = mutableListOf<IntArray>()
        var i = 0
        var n = intervals.size
        var currentInterval = newInterval

        while(i<n && intervals[i][1] < currentInterval[0]){
            result.add(intervals[i])
            i++
        }
        while(i<n && intervals[i][0] <= currentInterval[1]){
            currentInterval[0] = minOf(intervals[i][0], currentInterval[0])
            currentInterval[1] = maxOf(intervals[i][1], currentInterval[1])
            i++
        }
        result.add(currentInterval)
        while(i<n){
            result.add(intervals[i])
            i++
        }

        return result.toTypedArray()
    }
}
