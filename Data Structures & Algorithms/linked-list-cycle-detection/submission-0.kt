/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null) return false
        var slow = head
        var fast = head.next?.next
        while(slow != fast && slow != null && fast != null){
            slow = slow.next
            fast = fast.next?.next

        }
        return fast != null
    }
}
