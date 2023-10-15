package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Returning Strings**
*
*
* Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
*
* [Make sure you type the exact thing I wrote or the program may not execute properly]
*/

class GreetWithNameTest {
    @Test
    fun testGreetWithName() {
        Assert.assertEquals(greet("Ryan"), "Hello, Ryan how are you doing today?")
        Assert.assertEquals(greet("Shingles"), "Hello, Shingles how are you doing today?")
    }
}

fun greet(name: String): String {
    return "Hello, $name how are you doing today?"
}