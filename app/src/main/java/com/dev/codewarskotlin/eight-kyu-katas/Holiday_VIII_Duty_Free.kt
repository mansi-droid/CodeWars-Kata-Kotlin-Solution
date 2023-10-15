package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Assert
import org.junit.Test

/* **Holiday VIII - Duty Free**
*
* The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy such that the savings over the normal high street price would effectively cover the cost of your holiday.
*
* You will be given the high street price (normPrice, in £ (Pounds)), the duty free discount (discount, in percent) and the cost of the holiday (in £).
*
* For example, if a bottle costs £10 normally and the duty free discount is 10%, you would save £1 per bottle. If your holiday will cost £500, you would have to purchase 500 bottles to save £500, so the answer you return should be 500.
*
* Another example: if a bottle costs £12 normally and the duty free discount is 50%, you would save £6 per bottle. If your holiday will cost £1000, you would have to purchase 166.66 bottles to save £1000, so your answer should be 166 bottles.
*
* All inputs will be integers. Please return an integer. Round down.
*
*/

class DutyFreeTest {
    @Test
    fun testDutyFree() {
        Assert.assertEquals(166, dutyFree(12, 50, 1000))
        Assert.assertEquals(294, dutyFree(17, 10, 500))
        Assert.assertEquals(357, dutyFree(24, 35, 3000))
        Assert.assertEquals(60, dutyFree(377, 40, 9048))
        Assert.assertEquals(10, dutyFree(2479, 51, 13390))
    }
}

fun dutyFree(normPrice : Int, discount : Int, hol : Int) : Int {
    val normDiscountedPrice = normPrice * discount
    return hol * 100 / normDiscountedPrice
}