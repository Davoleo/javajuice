package net.davoleo.javajuice.math.matrix

interface SquareMatrix : Matrix {

    fun determinant(): Int

    fun isInvertible(): Boolean

    fun invert(): SquareMatrix


}