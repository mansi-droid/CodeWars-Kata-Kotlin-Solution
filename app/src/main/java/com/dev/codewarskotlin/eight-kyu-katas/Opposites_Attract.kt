package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Opposites Attract**
*
*
* Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
*
* Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
*/

class LoveFunTest {
    @Test
    fun testLoveFun() {
        Assert.assertTrue(loveFun(1, 4))
        Assert.assertFalse(loveFun(2, 2))
        Assert.assertTrue(loveFun(0, 1))
        Assert.assertFalse(loveFun(0, 0))
    }
}

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    val isAeven = flowerA%2 == 0
    val isBeven = flowerB%2 == 0
    return isAeven xor isBeven
}
