package net.davoleo.javajuice.math.vector

import kotlin.math.max
import kotlin.math.pow

class Vector3d(a: Double, b: Double, c: Double) : Vector {

    private val vec: DoubleArray

    init {
        vec = doubleArrayOf(a, b, c)
    }

    override val size: Int
        get() = 3

    override fun norm(type: Int): Double {
        return when (type) {
            // Norma 0
            0 -> {
                val res : Double = 0.0
                if(vec[0] != 0.0)
                    res.inc()
                if(vec[1] != 0.0)
                    res.inc()
                if(vec[2] != 0.0)
                    res.inc()
                return res
            }
            // Norma inf
            -1 -> max(vec[2], max(vec[0], vec[1]))
            // Norma >= 1
            else -> (vec[0].pow(type) + vec[1].pow(type) + vec[2].pow(type)).pow(1.0/type)
        }
    }

    override fun scale(multiplier: Double): Vector {
        return Vector3d(vec[0] * multiplier, vec[1] * multiplier, vec[2] * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        if(other !is Vector3d)
            return false
        return (vec[0] == other.vec[0] && vec[1] == other.vec[1] && vec[2] == other.vec[2])
    }

}