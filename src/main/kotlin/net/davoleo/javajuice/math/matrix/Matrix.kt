package net.davoleo.javajuice.math.matrix

interface Matrix {

    val size: Pair<Int, Int>

    fun rank(): Int

    fun sum(matrix: SquareMatrix): SquareMatrix

    fun product(matrix: SquareMatrix): SquareMatrix
}