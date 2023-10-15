package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Beginner - Lost Without a Map**
*
*
* Given an array of integers, return a new array with each value doubled.

    For example:
    * [1, 2, 3] --> [2, 4, 6]
*/

class MapsTest {
    @Test
    fun testMaps() {
        Assert.assertArrayEquals(intArrayOf(2, 4, 6), maps(intArrayOf(1, 2, 3)))
        Assert.assertArrayEquals(intArrayOf(8, 2, 2, 2, 8), maps(intArrayOf(4, 1, 1, 1, 4)))
        Assert.assertArrayEquals(intArrayOf(4, 4, 4, 4, 4, 4), maps(intArrayOf(2, 2, 2, 2, 2, 2)))
    }
}

fun maps(x: IntArray): IntArray {
    var newArray = intArrayOf()
    for(i in x){
        val doubleVal = i * 2
        newArray += doubleVal
    }

    return newArray
}