package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Enumerable Magic - Does My List Include This?**
*
* Create a method that accepts a list and an item, and returns true if the item belongs to the list, otherwise false.
*
*/

class ItemIncludeOrNotTest {
    @Test
    fun testItemIncludeOrNot() {
        Assert.assertEquals(true, include(intArrayOf(1,2,3,4), 2))
        Assert.assertEquals(false, include(intArrayOf(1,2,4,5), 3))
    }
}

fun include(arr: IntArray, item : Int): Boolean {
    return arr.contains(item)

    /* You can also write "return arr.contains(item) ?: false". This is another solution. */
    /* You can also write "return if(arr.contains(item)) true else false". This is another solution. */
}
