package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Well of Ideas - Easy Version**
*
* For every good kata idea there seem to be quite a few bad ones!
*
* In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.
*/

class WellKIdeasEasyVersionTest {
    @Test
    fun testWellKIdeasEasyVersion() {
        Assert.assertEquals("Publish!", well(arrayOf("good", "bad", "bad")))
    }
}

fun well(x: Array<String>): String {
    var a = 0
    for (i in x) {
        if (i == "good")
            a++
    }
    return when(a){
        1,2 -> "Publish!"
        0 -> "Fail!"
        else -> "I smell a series!"
    }
}