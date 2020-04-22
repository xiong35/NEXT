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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var tmp = ListNode(0)
        tmp.next = head
        var prev = tmp
        var curr = head
        while (curr != null){
            if (curr.`val` == `val`)
                prev.next = curr.next
            else
                prev = curr
            curr = curr.next
        }
        return tmp.next
    }
}