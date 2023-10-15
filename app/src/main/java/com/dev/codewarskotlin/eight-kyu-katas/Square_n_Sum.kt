package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Square(n) Sum**
*
* Complete the square sum function so that it squares each number passed into it and then sums the results together.
* For example, for [1, 2, 2] it should return 9 because 1*(2)+ 2*(2) + 2*(2) = 9
*
*/

class SquareNSumTest {
    @Test
    fun testSquareNSum() {
        Assert.assertEquals(5, squareSum(arrayOf(1, 2)))
        Assert.assertEquals(50, squareSum(arrayOf(0, 3, 4, 5)))
        Assert.assertEquals(0, squareSum(arrayOf()))
    }
}

fun squareSum(n: Array<Int>): Int {
    var sum = 0
    for(i in n){
        val result = i*i
        sum += result
    }
    return sum
}