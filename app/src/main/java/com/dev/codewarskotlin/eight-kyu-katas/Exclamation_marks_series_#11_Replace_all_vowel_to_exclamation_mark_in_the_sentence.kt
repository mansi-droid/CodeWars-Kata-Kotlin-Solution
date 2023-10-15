package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence**
*
* Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
*
    Examples:
    * replace("Hi!") === "H!!"
    * replace("!Hi! Hi!") === "!H!! H!!"
    * replace("aeiou") === "!!!!!"
    * replace("ABCDE") === "!BCD!"
*/

class ReplaceVowelToExclamationTest {
    @Test
    fun testReplaceVowelToExclamation() {
        Assert.assertEquals("H!!", replace("Hi!"));
        Assert.assertEquals("!H!! H!!", replace("!Hi! Hi!"));
        Assert.assertEquals("!!!!!", replace("aeiou"));
        Assert.assertEquals("!BCD!", replace("ABCDE"));
    }
}

fun replace(s: String): String = s.replace(Regex("[aeiouAEIOU]"), "!")