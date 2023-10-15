package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Beginner Series #2 Clock**
*
*
* Clock shows h hours, m minutes and s seconds after midnight.
*
* Your task is to write a function which returns the time since midnight in milliseconds.
*
    Example:
    * h = 0
    * m = 1
    * s = 1
    * result = 61000

    Input constraints:
    * 0 <= h <= 23
    * 0 <= m <= 59
    * 0 <= s <= 59
*/

class PastClockTest {
    @Test
    fun testPastClock() {
        Assert.assertEquals(61000, past(0, 1, 1))
        Assert.assertEquals(3661000, past(1, 1, 1))
        Assert.assertEquals(0, past(0, 0, 0))
        Assert.assertEquals(3601000, past(1, 0, 1))
        Assert.assertEquals(3600000, past(1, 0, 0))
    }
}

fun past(h: Int, m: Int, s: Int): Int {
    return ((((h * 60) + m)* 60) + s) * 1000
}