package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Remove String Spaces**
*
* Write a function that removes the spaces from the string, then return the resultant string.

    For example Input -> Output
    * "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
    * "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
    * "8aaaaa dddd r     " -> "8aaaaaddddr"
*/

class RemoveStringSpacesTest {
    @Test
    fun testRemoveStringSpaces() {
        Assert.assertEquals("8j8mBliB8gimjB8B8jlB", noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))
        Assert.assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"))
        Assert.assertEquals("8aaaaaddddr", noSpace("8aaaaa dddd r     "))
    }
}

fun noSpace(x : String) : String {
    return x.replace(" ", "")
}