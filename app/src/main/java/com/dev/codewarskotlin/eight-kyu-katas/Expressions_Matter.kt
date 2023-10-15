package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Expressions Matter**

    Task
    * Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
    * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained (Read the notes for more detail about it)

    Example : With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
    * 1 * (2 + 3) = 5
    * 1 * 2 * 3 = 6
    * 1 + 2 * 3 = 7
    * (1 + 2) * 3 = 9
    So the maximum value that you can obtain is 9.

    Notes
    * The numbers are always positive.
    * The numbers are in the range (1 ≤ a,b,c ≤ 10).
    * You can use the same operation more than once.
    * It's not necessary to place all the signs and brackets.
    * Repetition in numbers may occur .
    * You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.

    Input >> Output Examples:
    * expressionsMatter(1,2,3)  ==>  return 9

    Explanation:
    * After placing signs and brackets, the Maximum value obtained from the expression (1+2) * 3 = 9.
        * expressionsMatter(1,1,1)  ==>  return 3

    Explanation:
    * After placing signs, the Maximum value obtained from the expression is 1 + 1 + 1 = 3.
        * expressionsMatter(9,1,1)  ==>  return 18

    Explanation:
    * After placing signs and brackets, the Maximum value obtained from the expression is 9 * (1+1) = 18. ___# Task
        * Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
        * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained

    Example
    * With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
        * With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
        * 1 * (2 + 3) = 5
        * 1 * 2 * 3 = 6
        * 1 + 2 * 3 = 7
        * (1 + 2) * 3 = 9
        So the maximum value that you can obtain is 9.

     Notes
    * The numbers are always positive.
    * The numbers are in the range (1  ≤  a, b, c  ≤  10).
    * You can use the same operation more than once.
    * It's not necessary to place all the signs and brackets.
    * Repetition in numbers may occur .
    * You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.

    Input >> Output Examples:
    * expressionsMatter(1,2,3)  ==>  return 9

    Explanation:
    * After placing signs and brackets, the Maximum value obtained from the expression (1+2) * 3 = 9.
        * expressionsMatter(1,1,1)  ==>  return 3
*/

class ExpressionsMatterTest {
    @Test
    fun checkMixedValues() {
        Assert.assertEquals(6, ExpressionsMatterKata.expressionsMatter(2, 1, 2))
        Assert.assertEquals(3, ExpressionsMatterKata.expressionsMatter(1, 1, 1))
        Assert.assertEquals(4, ExpressionsMatterKata.expressionsMatter(2, 1, 1))
        Assert.assertEquals(9, ExpressionsMatterKata.expressionsMatter(1, 2, 3))
        Assert.assertEquals(5, ExpressionsMatterKata.expressionsMatter(1, 3, 1))
        Assert.assertEquals(8, ExpressionsMatterKata.expressionsMatter(2, 2, 2))
        Assert.assertEquals(60, ExpressionsMatterKata.expressionsMatter(2, 10, 3))
        Assert.assertEquals(27, ExpressionsMatterKata.expressionsMatter(1, 8, 3))
        Assert.assertEquals(126, ExpressionsMatterKata.expressionsMatter(9, 7, 2))
        Assert.assertEquals(20, ExpressionsMatterKata.expressionsMatter(1, 1, 10))
        Assert.assertEquals(18, ExpressionsMatterKata.expressionsMatter(9, 1, 1))
        Assert.assertEquals(300, ExpressionsMatterKata.expressionsMatter(10, 5, 6))
        Assert.assertEquals(12, ExpressionsMatterKata.expressionsMatter(1, 10, 1))
        Assert.assertEquals(20, ExpressionsMatterKata.expressionsMatter(5, 1, 3))
        Assert.assertEquals(105, ExpressionsMatterKata.expressionsMatter(3, 5, 7))
        Assert.assertEquals(35, ExpressionsMatterKata.expressionsMatter(5, 6, 1))
        Assert.assertEquals(8, ExpressionsMatterKata.expressionsMatter(1, 6, 1))
        Assert.assertEquals(14, ExpressionsMatterKata.expressionsMatter(2, 6, 1))
        Assert.assertEquals(48, ExpressionsMatterKata.expressionsMatter(6, 7, 1))
    }
}

class ExpressionsMatterKata {
    companion object {
        fun expressionsMatter(a : Int, b : Int, c : Int) : Int {
            val one = a + b + c
            val two = a + b * c
            val three = a * b + c
            val four = a * b * c
            val five = (a + b) * c
            val six = a * (b + c)
            return maxOf(one, two, three, four, five, six)
        }
    }
}