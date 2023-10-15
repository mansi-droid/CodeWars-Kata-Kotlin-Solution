package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Opposite number**
*
* Very simple, given an integer or a floating-point number, find its opposite.

    Examples:
    * 1: -1
    * 14: -14
    * -34: 34
*
*/

class OppositeNumberTest {
    @Test
    fun testOppositeNumber() {
        Assert.assertEquals(-1, opposite(1))
        Assert.assertEquals(-14, opposite(14))
        Assert.assertEquals(34, opposite(-34))
        Assert.assertEquals(-25, opposite(25))
    }
}

fun opposite(number: Int): Int {
    return -number
}

