/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
        val sortedIntervals = intervals.sortedBy { it.start }
        for(indice in 0..sortedIntervals.size -2){
            if(sortedIntervals[indice].end > sortedIntervals[indice + 1].start) return false
        }
        return true
    }
}
