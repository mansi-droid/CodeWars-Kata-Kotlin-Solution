package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Keep Hydrated**
*
* Nathan loves cycling.
*
* Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
*
* You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

    For example:
    * time = 3 ----> litres = 1
    * time = 6.7---> litres = 3
    * time = 11.8--> litres = 5
*/

class KeepHydratedsTest {
    @Test
    fun testKeepHydrateds() {
        Assert.assertEquals(1, litres(2.0))
        Assert.assertEquals(0, litres(1.4))
        Assert.assertEquals(6, litres(12.3))
        Assert.assertEquals(0, litres(0.82))
        Assert.assertEquals(5, litres(11.8))
        Assert.assertEquals(893, litres(1787.0))
        Assert.assertEquals(0, litres(0.0))
    }
}

fun litres(time: Double): Int {
    val result = (0.5*time)
    return result.toInt()
}