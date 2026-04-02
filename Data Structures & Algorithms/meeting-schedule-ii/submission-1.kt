/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun minMeetingRooms(intervals: List<Interval>): Int {
        val sortedStartTimes = intervals.map { it.start }.sorted()
        val sortedEndTimes = intervals.map { it.end }.sorted()
        var count = 0
        var maxRooms = 0
        var start = 0
        var end = 0
        while(start < intervals.size){
            if(sortedStartTimes[start] < sortedEndTimes[end]){
                count++
                start++
            } else {
                count--
                end++
            }
            maxRooms = maxOf(maxRooms, count)
        }
        
        return maxRooms
    }
}
