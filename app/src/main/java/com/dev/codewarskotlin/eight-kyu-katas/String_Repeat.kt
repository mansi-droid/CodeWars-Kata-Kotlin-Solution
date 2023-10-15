package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **String repeat**
*
* Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

    Examples (input -> output)
    * 6, "I"     -> "IIIIII"
    * 5, "Hello" -> "HelloHelloHelloHelloHello"
*
*/

class StringRepeatTest {
    @Test
    fun testStringRepeat() {
        Assert.assertEquals("aaaa", repeatStr(4, "a"))
        Assert.assertEquals("HelloHelloHello", repeatStr(3, "Hello"))
        Assert.assertEquals("", repeatStr(5, ""))
        Assert.assertEquals("", repeatStr(0, "kata"))
    }
}

fun repeatStr(r: Int, str: String) : String = str.repeat(r)