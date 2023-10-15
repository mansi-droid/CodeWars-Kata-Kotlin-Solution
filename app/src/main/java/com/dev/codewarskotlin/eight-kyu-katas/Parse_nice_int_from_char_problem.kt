package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Parse nice int from char problem**
*
* You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
*
* Write a program that returns the girl's age (0-9) as an integer.
*
* Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.
*/

class ParseIntCharProblemTest {
    @Test
    fun testParseIntCharProblem() {
        Assert.assertEquals(4, ParseIntCharProblem().getAge("4 years old"))
        Assert.assertEquals(5, ParseIntCharProblem().getAge("5 years old"))
        Assert.assertEquals(7, ParseIntCharProblem().getAge("7 years old"))
    }
}

class ParseIntCharProblem {
    fun getAge(yearsOld : String) : Int {
        val result = yearsOld.split(" ")
        return result[0].toInt()
    }
}