package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Count Odd Numbers below n**
*
* Given a number n, return the number of positive odd numbers below n, EASY!

    Examples (Input -> Output)
    * 7  -> 3 (because odd numbers below 7 are [1, 3, 5])
    * 15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
*/

class OddNumbersCountTest {
    @Test
    fun testOddNumbersCount() {
        Assert.assertEquals(7, oddCount(15))
        Assert.assertEquals(7511, oddCount(15023))
    }
}

fun oddCount(n: Int): Int {
    return (n/2)
}