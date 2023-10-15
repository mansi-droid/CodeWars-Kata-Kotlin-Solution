package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Cat years, Dog years**
*
* Kata Task
* I have a cat and a dog.
*
* I got them at the same time as kitten/puppy. That was humanYears years ago.
*
* Return their respective ages now as [humanYears,catYears,dogYears]
*
*
    NOTES:
    * humanYears >= 1
    * humanYears are whole numbers only

    Cat Years
    * 15 cat years for first year
    * +9 cat years for second year
    * +4 cat years for each year after that

    Dog Years
    * 15 dog years for first year
    * +9 dog years for second year
    * +5 dog years for each year after that

    References
    * http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
    * http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html
*/

class CalculateYearsTest {
    @Test
    fun testCalculateYears() {
        Assert.assertArrayEquals(arrayOf(1, 15, 15), calculateYears(1))
        Assert.assertArrayEquals(arrayOf(2, 24, 24), calculateYears(2))
        Assert.assertArrayEquals(arrayOf(10, 56, 64), calculateYears(10))
    }
}

fun calculateYears(years: Int): Array<Int> {
    return when(years){
        1 -> arrayOf(years, 15 , 15)
        2 -> arrayOf(years, 24 , 24)
        else -> arrayOf(years, 16 + (4 * years), 14 +(5 * years))
    }
}