package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Convert a String to a Number**
*
*
* We need a function that can transform a string into a number. What ways of achieving this do you know?
*
* Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
*
    Examples
    * "1234" --> 1234
    * "605"  --> 605
    * "1405" --> 1405
    * "-7" --> -7
*/

class StringToNumberTest {
    @Test
    fun testStringToNumber() {
        Assert.assertEquals(1234, stringToNumber("1234"))
        Assert.assertEquals(605, stringToNumber("605"))
        Assert.assertEquals(1405, stringToNumber("1405"))
        Assert.assertEquals(-7, stringToNumber("-7"))
    }
}

fun stringToNumber(str : String) : Int {
    return str.toInt()
}