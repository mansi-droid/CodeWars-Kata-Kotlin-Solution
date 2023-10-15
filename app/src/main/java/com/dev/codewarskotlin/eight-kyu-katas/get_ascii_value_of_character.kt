package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **get ascii value of character**
*
* Get ASCII value of a character.
* For the ASCII table you can refer to http://www.asciitable.com/
*/

class GetAsciiTest {
    @Test
    fun testGetAscii() {
        Assert.assertEquals(65, getAscii('A'))
        Assert.assertEquals(32, getAscii(' '))
        Assert.assertEquals(33, getAscii('!'))
    }
}

fun getAscii(c: Char): Int {
    return c.code

    /* You can also write "return c.toInt()". This is another solution. */
}