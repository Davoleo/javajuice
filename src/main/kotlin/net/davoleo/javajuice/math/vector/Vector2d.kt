package net.davoleo.javajuice.math.vector

class Vector2d(a: Double, b: Double) : Vector {

    private val vec: DoubleArray

    init {
        vec = doubleArrayOf(a, b)
    }

    override val size: Int
        get() = 2

    override fun norm(type: Int): Double {
        TODO("Not yet implemented")
    }

    override fun scale(multiplier: Double): Vector {
        return Vector2d(vec[0] * multiplier, vec[1] * multiplier);
    }
}