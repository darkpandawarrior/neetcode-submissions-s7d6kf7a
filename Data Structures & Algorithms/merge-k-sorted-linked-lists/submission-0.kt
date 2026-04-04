/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.isEmpty()) return null

        var minHeap = PriorityQueue<ListNode>{ a, b -> a.`val` - b.`val`}

        for(root in lists){
            if(root != null){
                minHeap.add(root)
            }
        }

        var dummy : ListNode? = ListNode(0)
        var tail = dummy
        while(minHeap.isNotEmpty()){
            val smallestNode = minHeap.poll()
            tail?.next = smallestNode
            tail = tail?.next

            if(smallestNode.next != null){
                minHeap.add(smallestNode.next)
            }
        }
        return dummy?.next
    }
}
