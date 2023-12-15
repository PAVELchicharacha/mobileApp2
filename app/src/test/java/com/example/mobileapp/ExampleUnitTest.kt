package com.example.mobileapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        var translate=Utilits()
        assertEquals(translate.ResultTest(8,9), "11")
        assertEquals(translate.ResultTest(16,15), "f")
    }
}