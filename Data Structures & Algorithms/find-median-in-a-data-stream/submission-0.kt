class MedianFinder {
    var largeHeap = PriorityQueue<Int>()
    var smallHeap = PriorityQueue<Int>(compareByDescending { it })
    fun addNum(num: Int) {
        smallHeap.add(num)
        largeHeap.add(smallHeap.poll())
        if(largeHeap.size > smallHeap.size){
            smallHeap.add(largeHeap.poll())
        }
    }

    fun findMedian(): Double {
        var result = 0.0
        if(smallHeap.size > largeHeap.size){
            result = smallHeap.peek().toDouble()
        } else if(largeHeap.size > smallHeap.size){
            result = largeHeap.peek().toDouble()
        } else {
            result = (smallHeap.peek() + largeHeap.peek())/2.0
        }
        return result
    }
}
