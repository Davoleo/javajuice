package net.davoleo.javajuice.math.vector

import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

class Vector2d(a: Double, b: Double) : Vector {

    private val vec: DoubleArray

    init {
        vec = doubleArrayOf(a, b)
    }

    override val size: Int
        get() = 2

    override fun norm(type: Int): Double {
        // Norma 1
        return when (type) {
            1 -> vec[0] + vec[1]
            // Norma 2
            2 -> sqrt(vec[0].pow(2.0) + vec[1].pow(2.0))
            // Norma inf
            else -> max(vec[0], vec[1])
        }
    }

    override fun scale(multiplier: Double): Vector {
        return Vector2d(vec[0] * multiplier, vec[1] * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        if(other !is Vector2d)
            return false
        return (vec[0] == other.vec[0] && vec[1] == other.vec[1])
    }
}