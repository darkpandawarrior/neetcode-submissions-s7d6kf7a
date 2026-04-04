/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        if(head?.next == null) return

        var slow = head
        var fast = head

        while(fast?.next != null && fast.next?.next != null){
            slow = slow?.next
            fast = fast.next?.next
        }

        var secondHalf = slow?.next
        slow?.next = null

        var prev : ListNode? = null
        var curr = secondHalf

        while(curr != null){
            var nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        }

        var reverseBack = prev

        var firstHalf = head
        while(reverseBack != null){
            val temp1 = firstHalf?.next
            val temp2 = reverseBack?.next

            firstHalf?.next = reverseBack
            reverseBack.next = temp1

            firstHalf = temp1
            reverseBack = temp2
        }
    }
}
