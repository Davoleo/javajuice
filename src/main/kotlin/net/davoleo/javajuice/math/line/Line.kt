package net.davoleo.javajuice.math.line

interface Line {
    fun solveForX(y: Double) : Double;
    fun solveForY(x: Double) : Double;
    fun nextPoint(p1: Pair<Double, Double>, p2: Pair<Double, Double>, dist: Double) : Pair<Double, Double>
}
