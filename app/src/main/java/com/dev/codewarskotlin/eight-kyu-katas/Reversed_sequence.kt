package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Reversed sequence**
*
* Build a function that returns an array of integers from n to 1 where n>0.
* Example : n=5 --> [5,4,3,2,1]
*/

class ReverseSeqTest {
    @Test
    fun testReverseSeq() {
        Assert.assertEquals(listOf(5, 4, 3, 2, 1), reverseSeq(5))
    }
}

fun reverseSeq(n: Int): List<Int> {
    val newList = mutableListOf<Int>()
    for(i in n downTo 1)  {
        newList += i
    }

    return newList
}