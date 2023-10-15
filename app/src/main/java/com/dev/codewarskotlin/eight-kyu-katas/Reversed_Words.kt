package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Reversed Words**
*
*
* Complete the solution so that it reverses all of the words within the string passed in.
*
* Words are separated by exactly one space and there are no leading or trailing spaces.

    Example(Input --> Output):
    * "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
*/

class ReverseWordsTest {
    @Test
    fun testReverseWords() {
        Assert.assertEquals("eating like I",Reverse.reverseWords("I like eating") )
        Assert.assertEquals("flying like I", Reverse.reverseWords("I like flying"))
        Assert.assertEquals("nice is world The", Reverse.reverseWords("The world is nice"))
        Assert.assertEquals("it!! Split Just", Reverse.reverseWords("Just Split it!!"))
        Assert.assertEquals("!!! !! !", Reverse.reverseWords("! !! !!!"))
        Assert.assertEquals("7777 777 77 7", Reverse.reverseWords("7 77 777 7777"))
        Assert.assertEquals("D : Jpazzy", Reverse.reverseWords("Jpazzy : D"))
    }
}

object Reverse{
    fun reverseWords(str:String):String {
        val newStr = str.split(" ")
        val result = arrayListOf<String>()

        for (i in newStr.size - 1 downTo 0) {
            result += newStr[i].toString()
        }

        return result.joinToString(" ")
    }
}