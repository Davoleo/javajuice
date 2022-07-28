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
            // Norma 0
            0 -> {
                val res : Double = 0.0
                if(vec[0] != 0.0)
                    res.inc()
                if(vec[1] != 0.0)
                    res.inc()
                return res
            }
            // Norma inf
            -1 -> max(vec[0], vec[1])
            // Norma >= 1
            else -> (vec[0].pow(type) + vec[1].pow(type)).pow(1.0/type)
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