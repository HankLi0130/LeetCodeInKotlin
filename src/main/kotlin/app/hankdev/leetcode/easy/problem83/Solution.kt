package app.hankdev.leetcode.easy.problem83

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var node = head
        while (node != null) {
            node.next = fetchNextNode(node)
            node = node.next
        }
        return head
    }

    fun fetchNextNode(node: ListNode): ListNode? {
        return node.next?.let { next ->
            if (node.`val` == next.`val`) fetchNextNode(next)
            else next
        }
    }
}