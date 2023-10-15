package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Find the smallest integer in the array**
*
* Given an array of integers your solution should find the smallest integer.

    For example:
    * Given [34, 15, 88, 2] your solution will return 2
    * Given [34, -345, -1, 100] your solution will return -345

* You can assume, for the purpose of this kata, that the supplied array will not be empty.
*/

class SmallestIntegerFinderTest {
    @Test
    fun testSmallestIntegerFinder() {
        val sif : SmallestIntegerFinder = SmallestIntegerFinder()
        Assert.assertEquals(10, sif.findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
    }
}

class SmallestIntegerFinder {
    fun findSmallestInt(nums : List<Int>) : Int {
        var result = nums[0]
        for (i in nums) {
            if (result > i) {
                result = i
            }
        }
        return result
    }
}