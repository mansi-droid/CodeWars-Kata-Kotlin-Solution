package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Grasshopper - Summation**
*
* Summation
* Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

    For example (Input -> Output):
    * 2 -> 3 (1 + 2)
    * 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
*/

class GrasshopperSummationTest {
    @Test
    fun testGrasshopperSummation() {
        Assert.assertEquals(1, GrassHopper.summation(1))
        Assert.assertEquals(36, GrassHopper.summation(8))
        Assert.assertEquals(10, GrassHopper.summation(4))
        Assert.assertEquals(78, GrassHopper.summation(12))
    }
}

object GrassHopper {
    fun summation(n:Int):Int {
        var sum = 0
        for(i in 1..n){
            sum += i
        }
        return sum
    }
}