package net.davoleo.javajuice.math.vector

import org.junit.jupiter.api.Test

import kotlin.math.abs
import kotlin.math.pow

internal class Vector2dTest {

    val a : Double = 5.3
    val b : Double = 2.4
    val norm0: Double = 0.0
    val norm2 : Double = 5.818075283
    val normInf : Double = 5.3
    val mul : Double = 43.3
    val vec2d : Vector2d = Vector2d(a, b)
    val delta : Double = 0.000001

    @Test
    fun getSize() {
        assert(vec2d.size == 2)
    }

    @Test
    fun norm() {
        assert(abs(vec2d.norm(0) - norm0) < delta)
        assert(abs(vec2d.norm(2) - norm2) < delta)
        assert(abs(vec2d.norm(-1) - normInf) < delta)
    }

    @Test
    fun scale() {
        assert(vec2d.scale(mul) == Vector2d(a*mul, b*mul))
    }

}