package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Count of positives / sum of negatives**
*
*
* Given an array of integers.
*
* Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
*
* If the input is an empty array or is null, return an empty array.
*
    Example:
    * For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
*/

class CountPositivesSumNegativesTest {
    @Test
    fun testCountPositivesSumNegatives() {
        Assert.assertArrayEquals(arrayOf(10, -65), countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
        Assert.assertArrayEquals(arrayOf(8, -50), countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)))
    }
}

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    if(input != null && input.isNotEmpty()){
        return arrayOf(input.filter { it > 0 }.count(), input.filter { it < 0 }.sum())
    }

    return arrayOf()
}