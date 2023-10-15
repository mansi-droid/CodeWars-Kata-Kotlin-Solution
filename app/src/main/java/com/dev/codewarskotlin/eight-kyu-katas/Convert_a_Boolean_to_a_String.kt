package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Convert a Boolean to a String**
*
*
* Implement a function which convert the given boolean value into its string representation.
*
* Note: Only valid inputs will be given.
*/

class ConvertBooleanToStringTest {
    @Test
    fun testConvertBooleanToString() {
        Assert.assertEquals("true", convert(true))
        Assert.assertEquals("false", convert(false))
    }
}

fun convert(b : Boolean) : String {
    return b.toString()
}
