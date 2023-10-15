package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **EVEN OR ODD**
*
* Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
*
*/

class EvenOrOddTest {
    @Test
    fun testEvenOrOdd() {
        Assert.assertEquals("Odd", evenOrOdd(3))
        Assert.assertEquals("Even", evenOrOdd(10))
    }
}

fun evenOrOdd(number : Int) : String {
    return if (number % 2 == 0) "Even" else "Odd"
}

