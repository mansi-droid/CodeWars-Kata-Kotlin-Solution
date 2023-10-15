package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **The Feast of Many Beasts**
*
*
* All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
*
* Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.
*
* Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.
*
*/

class FeastTest {
    @Test
    fun testFeast() {
        Assert.assertEquals(true, feast("great blue heron", "garlic naan"))
        Assert.assertEquals(true, feast("chickadee", "chocolate cake"))
        Assert.assertEquals(false, feast("brown bear", "bear claw"))
        Assert.assertEquals(true, feast("marmot", "mulberry tart"))
        Assert.assertEquals(true, feast("porcupine", "pie"))
        Assert.assertEquals(false, feast("electric eel", "lasagna"))
        Assert.assertEquals(true, feast("slow loris", "salsas"))
        Assert.assertEquals(true, feast("ox", "orange lox"))
        Assert.assertEquals(true, feast("blue-footed booby", "blueberry"))
    }
}

fun feast(beast : String, dish : String) : Boolean {
    if (beast[0] == dish[0] && (beast.get(beast.length - 1) == dish.get(dish.length - 1))) {
        return true
    }

    return false
}