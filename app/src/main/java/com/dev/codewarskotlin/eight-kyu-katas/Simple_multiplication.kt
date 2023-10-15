package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Simple multiplication**
*
*
* This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
*/

class SimpleMultiplicationTest {
    @Test
    fun testSimpleMultiplication() {
        Assert.assertEquals(9, simpleMultiplication(1))
        Assert.assertEquals(27, simpleMultiplication(3))
        Assert.assertEquals(16, simpleMultiplication(2))
        Assert.assertEquals(32, simpleMultiplication(4))
    }
}

fun simpleMultiplication(n: Int): Int {
    if(n%2 == 0){
        return n*8
    }

    return n*9
}
