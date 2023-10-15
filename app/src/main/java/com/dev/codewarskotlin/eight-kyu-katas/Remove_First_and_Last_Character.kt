package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Remove First and Last Character**
*
* It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
* You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
*
*/

class RemoveFirstAndLastCharacterTest {
    @Test
    fun testRemoveFirstAndLastCharacter() {
        Assert.assertEquals("loquen", removeChar("eloquent"))
        Assert.assertEquals("ountr", removeChar("country"))
        Assert.assertEquals("erso", removeChar("person"))
        Assert.assertEquals("lac", removeChar("place"))
    }
}

fun removeChar(str : String) : String {
    return str.substring(1, str.length - 1)
}