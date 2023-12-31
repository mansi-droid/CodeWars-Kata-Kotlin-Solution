package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Grasshopper - Terminal game move function**
*
* Terminal game move function
*
* In this game, the hero moves from left to right. The player rolls the dice and moves the number of spaces indicated by the dice two times.
*
* Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.
*
    Example:
    * move(3, 6) should equal 15
*/

class GameMoveTest {
    @Test
    fun testGameMove() {
        Assert.assertEquals(8, move(0, 4))
        Assert.assertEquals(15, move(3, 6))
        Assert.assertEquals(12, move(2, 5))
    }
}

fun move(pos : Int, roll : Int) : Int {
    return pos + (roll * 2)
}