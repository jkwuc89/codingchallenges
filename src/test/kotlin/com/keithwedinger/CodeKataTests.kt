package com.keithwedinger

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Tests for CodeKata
 *
 * @author Keith Wedinger <br>
 * Created On: 2/11/18
 */

class CodeKataTests {
    private val codeKata = CodeKata()

    @Test
    fun `Test chop`() {
        Assertions.assertEquals(-1, codeKata.chop(3, intArrayOf()))
        Assertions.assertEquals(-1, codeKata.chop(3, intArrayOf(1)))
        Assertions.assertEquals(0, codeKata.chop(1, intArrayOf(1)))
        Assertions.assertEquals(0, codeKata.chop(1, intArrayOf(1, 3, 5)))
        Assertions.assertEquals(1, codeKata.chop(3, intArrayOf(1, 3, 5)))
        Assertions.assertEquals(2, codeKata.chop(5, intArrayOf(1, 3, 5)))
        Assertions.assertEquals(-1, codeKata.chop(0, intArrayOf(1, 3, 5)))
        Assertions.assertEquals(-1, codeKata.chop(2, intArrayOf(1, 3, 5)))
        Assertions.assertEquals(-1, codeKata.chop(4, intArrayOf(1, 3, 5)))
        Assertions.assertEquals(-1, codeKata.chop(6, intArrayOf(1, 3, 5)))
        Assertions.assertEquals(0, codeKata.chop(1, intArrayOf(1, 3, 5, 7)))
        Assertions.assertEquals(1, codeKata.chop(3, intArrayOf(1, 3, 5, 7)))
        Assertions.assertEquals(2, codeKata.chop(5, intArrayOf(1, 3, 5, 7)))
        Assertions.assertEquals(3, codeKata.chop(7, intArrayOf(1, 3, 5, 7)))
        Assertions.assertEquals(-1, codeKata.chop(2, intArrayOf(1, 3, 5, 7)))
        Assertions.assertEquals(-1, codeKata.chop(4, intArrayOf(1, 3, 5, 7)))
        Assertions.assertEquals(-1, codeKata.chop(6, intArrayOf(1, 3, 5, 7)))
        Assertions.assertEquals(-1, codeKata.chop(8, intArrayOf(1, 3, 5, 7)))
    }
}