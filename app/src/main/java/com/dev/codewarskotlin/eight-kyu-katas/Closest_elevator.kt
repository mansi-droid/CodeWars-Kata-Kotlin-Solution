package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Closest elevator**
*
* Given 2 elevators (named "left" and "right") in a building with 3 floors (numbered 0 to 2), write a function elevator accepting 3 arguments (in order):
    * left - The current floor of the left elevator
    * right - The current floor of the right elevator
    * call - The floor that called an elevator
    *

* It should return the name of the elevator closest to the called floor ("left"/"right").
*
* In the case where both elevators are equally distant from the called floor, choose the elevator to the right.
*
* You can assume that the inputs will always be valid integers between 0-2.
    Examples:
    * elevator(0, 1, 0) // => "left"
    * elevator(0, 1, 1) // => "right"
    * elevator(0, 1, 2) // => "right"
    * elevator(0, 0, 0) // => "right"
    * elevator(0, 2, 1) // => "right"
*/

class ClosestElevatorTest {
    @Test
    fun testClosestElevator() {
        Assert.assertEquals("left", elevator(0,1,0))
        Assert.assertEquals("right", elevator(0,1,1))
        Assert.assertEquals("right", elevator(0,1,2))
        Assert.assertEquals("right", elevator(0,0,0))
        Assert.assertEquals("right", elevator(0,2,1))
    }
}

fun elevator(left: Int, right: Int, call: Int): String {
    if(left == right) return "right"

    val leftDistance = Math.abs(left - call)
    val rightDistance = Math.abs(right - call)

    if(leftDistance< rightDistance){
        return "left"
    }

    return "right"
}