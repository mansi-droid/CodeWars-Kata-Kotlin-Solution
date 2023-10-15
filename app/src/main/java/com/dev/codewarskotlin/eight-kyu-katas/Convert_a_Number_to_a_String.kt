package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Convert a Number to a String**
*
* We need a function that can transform a number (integer) into a string.
* What ways of achieving this do you know?

    Examples (input --> output):
    * 123  --> "123"
    * 999  --> "999"
    * -100 --> "-100"
*
*/

class ConvertNumberToStringTest {
    @Test
    fun testConvertNumberToString() {
        Assert.assertEquals("67", numberToString(67))
        Assert.assertEquals("123", numberToString(123))
        Assert.assertEquals("999", numberToString(999))
        Assert.assertEquals("-100", numberToString(-100))
    }
}
fun numberToString(num: Int): String {
    return num.toString()
}