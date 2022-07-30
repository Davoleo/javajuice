package net.davoleo.javajuice.math.vector

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.abs

internal class Vector3dTest {

    val a : Double = 5.3
    val b : Double = 2.4
    val c : Double = 3.3
    val norm0: Double = 3.0
    val norm1: Double = 11.0
    val norm2 : Double = 6.6887966032763
    val normInf : Double = 5.3
    val mul : Double = 43.3
    val vec3d : Vector3d = Vector3d(a, b, c)
    val delta : Double = 0.000001

    @Test
    fun getSize() {
        assert(vec3d.size == 3)
    }

    @Test
    fun norm() {
        assert(abs(vec3d.norm(0) - norm0) < delta)
        assert(abs(vec3d.norm(1) - norm1) < delta)
        assert(abs(vec3d.norm(2) - norm2) < delta)
        assert(abs(vec3d.norm(-1) - normInf) < delta)
    }

    @Test
    fun scale() {
        assert(vec3d.scale(mul) == Vector3d(a*mul, b*mul, c*mul))
    }
}