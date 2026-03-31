class Solution {
    fun maxArea(heights: IntArray): Int {
        var bar1 = 0
        var bar2 = heights.size - 1
        var maxArea = 0
        while (bar1 < bar2){
            var currentHeight = minOf(heights[bar2], heights[bar1])
            var currentArea = currentHeight * (bar2 - bar1)
            maxArea = maxOf(maxArea, currentArea)
            if(heights[bar2] > heights[bar1]){
                bar1++
            } else {
                bar2--
            }
        }
        return maxArea
    }
}
