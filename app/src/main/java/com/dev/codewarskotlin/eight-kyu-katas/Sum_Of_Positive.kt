package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Sum of positive**
*
* You get an array of numbers, return the sum of all of the positives ones.
    Example [1,-4,7,12] => 1 + 7 + 12 = 20
    Note: if there is nothing to sum, the sum is default to 0.
*
*/

class SumOfPositiveTest {
    @Test
    fun testSumOfPositive() {
        Assert.assertEquals(15, sum(intArrayOf(1, 2, 3, 4, 5)))
        Assert.assertEquals(13, sum(intArrayOf(1, -2, 3, 4, 5)))
        Assert.assertEquals(0, sum(intArrayOf(-1, -2, -3, -4, -5)))
        Assert.assertEquals(9, sum(intArrayOf(-1, 2, 3, 4, -5)))
    }
}

fun sum(numbers: IntArray): Int {
    var sum = 0
    for(i in numbers.filter { it >0 }){
        sum += i
    }
    return sum
}
