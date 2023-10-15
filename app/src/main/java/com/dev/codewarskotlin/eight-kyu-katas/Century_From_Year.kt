package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Century From Year**
*
    Introduction
    * The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

    Task
    * Given a year, return the century it is in.

    Examples
    * 1705 --> 18
    * 1900 --> 19
    * 1601 --> 17
    * 2000 --> 20
*
*
* Note: this kata uses strict construction as shown in the description and the examples, you can read more about it https://en.wikipedia.org/wiki/Century

*/

class CenturyFromYearTest {
    @Test
    fun testCenturyFromYear() {
        Assert.assertEquals(18, century(1705))
        Assert.assertEquals(19, century(1900))
        Assert.assertEquals(17, century(1601))
        Assert.assertEquals(20, century(2000))
        Assert.assertEquals(1, century(89))
    }
}

fun century(number : Int) : Int {
    return if (number % 100 == 0) {
        number / 100
    } else {
        (number / 100) + 1
    }
}