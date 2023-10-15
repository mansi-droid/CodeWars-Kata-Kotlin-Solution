package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Twice as old**
*
*
* Your function takes two arguments:
* 1. current father's age (years)
* 2. current age of his son (years)
*
* Calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.
*
*/

class TwiceAsOldsTest {
    @Test
    fun testTwiceAsOld() {
        Assert.assertEquals(22, twiceAsOld(36, 7))
        Assert.assertEquals(5, twiceAsOld(55, 30))
        Assert.assertEquals(0, twiceAsOld(42, 21))
        Assert.assertEquals(20, twiceAsOld(22, 1))
        Assert.assertEquals(29, twiceAsOld(29, 0))
    }
}

fun twiceAsOld(dadYearsOld : Int, sonYearsOld : Int) : Int {
    val age = dadYearsOld - sonYearsOld
    return if (age < sonYearsOld) {
        sonYearsOld - age
    } else {
        age - sonYearsOld
    }
}