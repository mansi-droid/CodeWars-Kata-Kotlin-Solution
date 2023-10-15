package com.dev.codewarskotlin.`eight-kyu-katas`

import org.junit.Test
import org.testng.Assert.assertEquals

/* **Volume of a Cuboid**
*
* Bob needs a fast way to calculate the volume of a cuboid with three values: the length, width and height of the cuboid. Write a function to help Bob with this calculation.
*/

class VolumeOfCuboidTest {
    private val delta = 0.0001

    @Test
    public fun examples() {
        assertEquals(4.0, volumeOfCuboid(1.0, 2.0, 2.0), delta)
        assertEquals(63.0, volumeOfCuboid(6.3, 2.0, 5.0), delta)
    }
}

fun volumeOfCuboid(length : Double, width : Double, height : Double) : Double {
    return length * width * height
}