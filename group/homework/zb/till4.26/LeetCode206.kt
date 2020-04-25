/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head?.next == null)
            return head
        var prev = ListNode(0)
        var curr = ListNode(0)
        var nextPosition = ListNode(0)
        prev.next = null
        curr.next = head
        nextPosition.next = head.next
        while (nextPosition.next != null)
        {
            curr.next?.next = prev.next
            prev.next = curr.next
            curr.next = nextPosition.next
            nextPosition.next = nextPosition.next?.next
        }
        curr.next?.next = prev.next
        return curr.next
    }
}