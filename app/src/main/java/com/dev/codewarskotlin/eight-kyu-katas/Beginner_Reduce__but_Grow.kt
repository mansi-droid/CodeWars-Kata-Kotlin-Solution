package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Beginner - Reduce but Grow**
*
* Given a non-empty array of integers, return the result of multiplying the values together in order.
* Example:
    * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/

class GrowTest {
    @Test
    fun testGrow() {
        Assert.assertEquals(6, grow(intArrayOf(1, 2, 3)))
        Assert.assertEquals(16, grow(intArrayOf(4, 1, 1, 1, 4)))
        Assert.assertEquals(64, grow(intArrayOf(2, 2, 2, 2, 2, 2)))
    }
}

fun grow(arr: IntArray): Int {
    var result = 1
    for(i in arr){
        result = result * i
    }

    return result
}