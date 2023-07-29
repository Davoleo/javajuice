package net.davoleo.javajuice.math.line

import kotlin.math.sqrt
import kotlin.math.pow

public class StraightLine(m: Double, q: Double) : Line {
    private val m: Double
    private val q: Double

    init {
        this.m = m
        this.q = q
    }

    override fun solveForX(y: Double) : Double {
        return (y - q) / m;
    }

    override fun solveForY(x: Double) : Double {
        return m * x + q;
    }

    override fun nextPoint(p1: Pair<Double, Double>, p2: Pair<Double, Double>, dist: Double) : Pair<Double, Double> {
        val len: Double = sqrt((p2.first - p1.first).pow(2.0) + (p2.second - p1.second).pow(2.0))
        val d: Pair<Double, Double> = Pair((p2.first - p1.first) / len, (p2.second - p1.second) / len)

        return Pair(p2.first + d.first * dist, p2.second + d.second * dist)
    }
}
