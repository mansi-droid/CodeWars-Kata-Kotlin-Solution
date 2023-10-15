package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Return Negative**
*
* In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

    Examples
    * Kata().makeNegative(1)  // return -1
    * Kata().makeNegative(-5) // return -5
    * Kata().makeNegative(0)  // return 0

    Notes
    * The number can be negative already, in which case no change is required.
    * Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
*
*/

class ReturnNegativeTest {
    @Test
    fun testReturnNegative() {
        val kata = ReturnNegativeKata()
        Assert.assertEquals(-42, kata.makeNegative(42))
        Assert.assertEquals(-18, kata.makeNegative(-18))
        Assert.assertEquals(-20, kata.makeNegative(20))
        Assert.assertEquals(-45, kata.makeNegative(45))
    }
}

class ReturnNegativeKata {
    fun makeNegative(x : Int) : Int {
        val negative : Int = if (x < 0) x else -x
        return negative
    }
}
