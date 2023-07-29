package net.davoleo.javajuice.math.line

import org.junit.jupiter.api.Test
import kotlin.math.abs

class StraightLineTest {

    private val m: Double = 5.0
    private val q: Double = 3.0
    private val sl:StraightLine = StraightLine(m, q)
    private val delta : Double = 0.000001

    @Test
    fun solveForX() {
        assert(abs(sl.solveForX(2.0) - -0.2) < delta)
    }

    @Test
    fun solveForY() {
        assert(abs(sl.solveForY(3.0) - 18.0) < delta)
    }

    @Test
    fun nextPoint() {
        val res: Pair<Double, Double> = sl.nextPoint(Pair(2.0, 2.0), Pair(5.0, 10.0), 6.0)
        System.out.println(res);
        assert(abs(res.first - 7.106740649530350) < delta)
        assert(abs(res.second - 15.617975065414267) < delta)
    }
}