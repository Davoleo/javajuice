package net.davoleo.javajuice.math.vector

interface Vector {

    val size: Int

    fun norm(type: Int): Double

    fun length(): Double {
        return norm(2);
    }


//    fun angle(vector: Vector): Double
//
//    fun project(vector: Vector): Vector
//
//    fun sum(vector: Vector): Vector
//
//    fun subtract(vector: Vector): Vector

    fun scale(multiplier: Double): Vector

//    fun dotProduct(vector: Vector): Vector
//
//    fun crossProduct(vector: Vector): Vector


}