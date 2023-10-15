package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **You Can't Code Under Pressure #1**
*
*
* Code as fast as you can! You need to double the integer and return it.
*/

class DoubleIntegerTest {
    @Test
    fun testDoubleInteger() {
        Assert.assertEquals(4, doubleInteger(2))
    }
}

fun doubleInteger(i : Int) : Int {
    return i + i
}
