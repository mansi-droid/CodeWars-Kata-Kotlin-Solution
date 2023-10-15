package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Total amount of points**
*
*
* Our football team has finished the championship.
*
* Our team's match results are recorded in a collection of strings. Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.
*
* For example: ["3:1", "2:2", "0:1", ...]
*
    Points are awarded for each match as follows:
    * if x > y: 3 points (win)
    * if x < y: 0 points (loss)
    * if x = y: 1 point (tie)

* We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.

    Notes:
    * our team always plays 10 matches in the championship
    * 0 <= x <= 4
    * 0 <= y <= 4
*/

class TotalPointsTest {
    @Test
    fun testTotalPoints() {
        Assert.assertEquals(30, points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
        Assert.assertEquals(10, points(listOf("1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4")))
        Assert.assertEquals(0, points(listOf("0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4")))
        Assert.assertEquals(15, points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4")))
        Assert.assertEquals(12, points(listOf("1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4")))
    }
}

fun points(games: List<String>): Int {
    var result = 0
    for(i in games){
        val x= i[0]
        val y = i[2]
        if(x>y){ // x win
            result += 3
        }

        if(x == y) { // loss
            result += 1
        }
    }
    return result
}