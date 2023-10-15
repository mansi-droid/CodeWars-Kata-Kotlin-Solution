package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Is he gonna survive?**
*
*
* A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?
*
* Return true if yes, false otherwise :)
*
*/

class HeroSurviveTest {
    @Test
    fun testHeroSurvive() {
        Assert.assertEquals(true, hero(10, 5))
        Assert.assertEquals(false, hero(7, 4))
        Assert.assertEquals(false, hero(4, 5))
        Assert.assertEquals(true , hero(100, 40))
        Assert.assertEquals(false, hero(1500, 751))
        Assert.assertEquals(false, hero(0, 1))
    }
}

fun hero(bullets: Int, dragons: Int) : Boolean {
    if(dragons*2 <= bullets){
        return true
    }
    return false
}