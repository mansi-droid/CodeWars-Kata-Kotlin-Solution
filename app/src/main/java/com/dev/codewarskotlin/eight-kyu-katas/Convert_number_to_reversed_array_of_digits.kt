package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Convert number to reversed array of digits**
*
*
* Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
*
    Example(Input => Output):
    * 35231 => [1,3,2,5,3]
    * 0 => [0]
    * "1405" --> 1405
    * "-7" --> -7
*/

class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    fun testConvertNumberToReversedArrayOfDigits() {
        Assert.assertArrayEquals(
            intArrayOf(1, 3, 2, 5, 3),
            ConvertNumberToReversedArrayOfDigitsKata.digitize(35231)
        )
        Assert.assertArrayEquals(
            intArrayOf(0),
            ConvertNumberToReversedArrayOfDigitsKata.digitize(0)
        )
    }
}

object ConvertNumberToReversedArrayOfDigitsKata {
    fun digitize(n : Long) : IntArray {
        val valueStrReversed = n.toString().reversed()
        val result = valueStrReversed.map {
            it.digitToInt()
        }.toIntArray()
        return result
    }
}