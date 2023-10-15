package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Invert values**
*
*
* Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
    * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
    * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
    * invert([]) == []
*/

class InvertArrayValuesTest {
    @Test
    fun testInvertArrayValues() {
        Assert.assertArrayEquals(intArrayOf(-1,-2,-3,-4,-5), invert(intArrayOf(1,2,3,4,5)))
        Assert.assertArrayEquals(intArrayOf(-1,2,-3,4,-5), invert(intArrayOf(1,-2,3,-4,5)))
        Assert.assertArrayEquals(intArrayOf(), invert(intArrayOf()))
        Assert.assertArrayEquals(intArrayOf(0), invert(intArrayOf(0)))
    }
}

fun invert(arr: IntArray): IntArray {
    var newArray = intArrayOf()
    for(i in arr){
        val result = -i
        newArray += result
    }

    return newArray
}


