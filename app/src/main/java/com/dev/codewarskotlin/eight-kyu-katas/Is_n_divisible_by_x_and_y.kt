package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Is n divisible by x and y?**
*
*
* Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero numbers.
*
    Examples:
    1) n =   3, x = 1, y = 3 =>  true because   3 is divisible by 1 and 3
    2) n =  12, x = 2, y = 6 =>  true because  12 is divisible by 2 and 6
    3) n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
    4) n =  12, x = 7, y = 5 => false because  12 is neither divisible by 7 nor 5
*/

class IsDivisibleTest {
    @Test
    fun testIsDivisible() {
        Assert.assertEquals(false, isDivisible(3, 3, 4))
        Assert.assertEquals(true, isDivisible(12, 3, 4))
        Assert.assertEquals(false, isDivisible(8, 3, 4))
        Assert.assertEquals(true, isDivisible(48, 3, 4))
        Assert.assertEquals(true, isDivisible(100, 5, 10))
        Assert.assertEquals(false, isDivisible(100, 5, 3))
        Assert.assertEquals(true, isDivisible(4, 4, 2))
        Assert.assertEquals(false, isDivisible(5, 2, 3))
        Assert.assertEquals(true, isDivisible(17, 17, 17))
        Assert.assertEquals(true, isDivisible(17, 1, 17))
    }
}

fun isDivisible(n: Int, x: Int, y: Int): Boolean {
    return if (n %x == 0 && n %y == 0){
        true
    }else {
        false
    }
}