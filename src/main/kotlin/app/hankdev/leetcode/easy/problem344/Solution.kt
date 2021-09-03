package dev.hankli.leetcode.easy.problem344

/**
 * https://leetcode.com/problems/reverse-string/
 */

fun main() {
    //val input = "A man, a plan, a canal: Panama".toCharArray()
    val input = "hello world".toCharArray()
    reverseString(input)
}

fun reverseString(s: CharArray): Unit {
    if (s.size in 1..100000) {

        val totalCount = if (s.size % 2 == 0) {
            (s.size - 1) / 2
        } else {
            s.size / 2
        }

        for (index in 0..totalCount) {
            val reversedIndex = s.size - 1 - index
            val temp = s[index]
            s[index] = s[reversedIndex]
            s[reversedIndex] = temp
        }
        println(s)
    }
}