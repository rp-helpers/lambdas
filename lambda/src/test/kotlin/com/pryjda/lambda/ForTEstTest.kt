package com.pryjda.lambda

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


internal class ForTEstTest {

    @Test
    fun invokeLambda1() {
        //given
        val lambda = { arg: Double -> arg == 4.22 }
        val test = ForTEst()
        //when
        val result = test.invokeLambda(lambda)
        //then
        assertTrue(result)
    }

    @Test
    fun invokeLambda2() {
        //given
        val lambda = { arg: Double -> !arg.isNaN() }
        val test = ForTEst()
        //when
        val result = test.invokeLambda(lambda)
        //then
        assertTrue(result)
    }
}