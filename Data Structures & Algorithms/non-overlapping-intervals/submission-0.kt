class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        if(intervals.isEmpty()) return 0
        intervals.sortBy{it[1]}
        var removals = 0
        var lastEnd = intervals[0][1]

        for(i in 1 until intervals.size){
            var currentStart = intervals[i][0]
            var currentEnd = intervals[i][1]

            if(currentStart < lastEnd){
                removals++
            } else {
                lastEnd = currentEnd
            }
        }


        return removals
    }
}
