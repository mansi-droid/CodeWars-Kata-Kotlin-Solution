package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Multiply** */

class MultiplyTest {
    @Test
    fun testMultiply() {
        Assert.assertEquals(15.0, multiply(5.0, 3.0), 0.0001)
        Assert.assertEquals(9.0, multiply(3.0, 3.0), 0.0001)
    }
}


fun multiply(x: Double, y: Double) : Double {
    return x * y
}