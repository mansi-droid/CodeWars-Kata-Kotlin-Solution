package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **MakeUpperCase**
*
*
* Write a function which converts the input string to uppercase.
*
*/

class MakeUpperCaseTest {
    @Test
    fun testMakeUpperCase() {
        Assert.assertEquals("HELLO", makeUpperCase("hello"))
    }
}

fun makeUpperCase(str: String): String {
    var result =  String()
    for (i in str) {
        result += if(i in 'a'..'z') {
            i - 32
        } else{
            i
        }
    }
    return result
}

/* Short solution */
/*
fun makeUpperCase(str: String): String {
    return str.toUpperCase()
}*/
