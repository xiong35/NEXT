// general
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun creatListNode(): ListNode? {
    var nodeVals: List<Int> = listOf(1)
    var chain: ListNode? = ListNode(0)
    var curNode: ListNode? = chain
    nodeVals.forEach {
        curNode!!.next = ListNode(it)
        curNode = curNode?.next
    }
    return chain!!.next
}

fun printChain(chain: ListNode?) {
    println()
    var node = chain
    while (true) {
        print(node?.`val` ?: return)
        node = node.next
    }
}

// 202
class Solution202 {
    fun isHappy(n: Int): Boolean {
        var shownNums: MutableList<Int> = mutableListOf()
        var sum = n
        while (true) {
            sum = getSumOfNums(sum)
            if (sum == 1) {
                return true
            }
            if (sum in shownNums) {
                return false
            }
            shownNums.add(sum)
        }
    }

    fun getSumOfNums(input: Int): Int {
        var n = input
        var sum = 0
        while (n > 0) {
            var curNum = n % 10
            sum += curNum * curNum
            n /= 10
        }
        return sum
    }
}

// 203
class Solution203 {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var localHead = head
        var node = head
        while (true) {
            when {
                node?.`val` == `val` -> {
                    localHead = localHead?.next
                    node = node.next
                }
                node?.next == null -> return localHead
                node.next!!.`val` == `val` -> remove(node)
                else -> node = node.next
            }
        }
    }

    fun remove(father: ListNode) {
        father.next = father.next?.next
    }
}

// 204

// 205

// 206

fun main(args: Array<String>) {
/*    var s202 = Solution202()
   println(s202.isHappy(19)) */

/*     var chain = creatListNode()
    printChain(chain)
    var s203 = Solution203()
    printChain(s203.removeElements(chain, 1)) */


}
