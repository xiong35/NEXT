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
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        if(headA == null || headB == null)
            return null
        var nodeA = ListNode(0)
        var nodeB = ListNode(0)
        nodeA.next = headA
        nodeB.next = headB
        var cnt = 0
        while (nodeA.next != nodeB.next && cnt <= 2)
        {
            if (nodeA.next?.next != null)
                nodeA.next = nodeA.next?.next
            else
            {
                nodeA.next = headB
                cnt++
            }
            if (nodeB.next?.next != null)
                nodeB.next = nodeB.next?.next
            else
            {
                nodeB.next = headA
                cnt++
            }
        }
        if (nodeA.next != nodeB.next)
            return null
        return nodeA.next
    }
}