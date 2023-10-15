package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Sum Mixed Array**
*
*
* Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
*
* Return your answer as a number.
*/

class MixedSumTest {
    @Test
    fun testMixedSum() {
        val mixedSum = MixedSum()
        Assert.assertEquals(10, mixedSum.sum(listOf(5,"5")))
        Assert.assertEquals(22, mixedSum.sum(listOf(9, 3, "7", "3")))
        Assert.assertEquals(42, mixedSum.sum(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)))
        Assert.assertEquals(41, mixedSum.sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")))
        Assert.assertEquals(45, mixedSum.sum(listOf("1", "5", "8", 8, 9, 9, 2, "3")))
        Assert.assertEquals(41, mixedSum.sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")))
        Assert.assertEquals(61, mixedSum.sum(listOf(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)))
    }
}

class MixedSum {
    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        var sum = 0
        for(i in mixed){
            var t: Int = 0

            if (i is String) { t = i.toInt() }
            if (i is Int) { t = i }

            sum += t
        }
        return sum
    }
}