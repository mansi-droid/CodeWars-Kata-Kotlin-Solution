package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Abbreviate a Two Word Name**
*
*
* Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
*
* The output should be two capital letters with a dot separating them.
*
    It should look like this:
    * Sam Harris => S.H
    * patrick feeney => P.F
*/

class AbbrevNameTest {
    @Test
    fun testAbbrevName() {
        Assert.assertEquals("S.H", abbrevName("Sam Harris"))
        Assert.assertEquals("P.F", abbrevName("Patrick Feenan"))
        Assert.assertEquals("E.C", abbrevName("Evan Cole"))
        Assert.assertEquals("P.F", abbrevName("P Favuzzi"))
        Assert.assertEquals("D.M", abbrevName("David Mendieta"))
    }
}

fun abbrevName(name : String) : String {
    val firstChar = name.substringBefore(" ").toUpperCase()
    val secondChar = name.substringAfter(" ").toUpperCase()
    val result = firstChar[0] + "." + secondChar[0]
    return result
}