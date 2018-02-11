package com.keithwedinger

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Tests for CoderByteChallenges and CoderByteChallengesKotlin
 *
 * @author Keith Wedinger <br>
 * Created On: 1/19/18
 */

class OperatorAsFunctionTest {
    private val operatorAsFunctionKotlin = OperatorAsFunctionKotlin()
    private val operatorAsFunctionJava = OperatorAsFunctionJava();

    @Test
    internal fun `Test Kotlin version of multiply`() {
        Assertions.assertEquals(0, operatorAsFunctionKotlin.multiply(0, 0))
        Assertions.assertEquals(10, operatorAsFunctionKotlin.multiply(1, 10))
        Assertions.assertEquals(10, operatorAsFunctionKotlin.multiply(10, 1))
        Assertions.assertEquals(100, operatorAsFunctionKotlin.multiply(10, 10))
        Assertions.assertEquals(-25, operatorAsFunctionKotlin.multiply(-5, 5))
        Assertions.assertEquals(25, operatorAsFunctionKotlin.multiply(-5, -5))
    }

    @Test
    internal fun `Test Java version of multiply`() {
        Assertions.assertEquals(0, operatorAsFunctionJava.multiply(0, 0))
        Assertions.assertEquals(10, operatorAsFunctionJava.multiply(1, 10))
        Assertions.assertEquals(10, operatorAsFunctionJava.multiply(10, 1))
        Assertions.assertEquals(100, operatorAsFunctionJava.multiply(10, 10))
        Assertions.assertEquals(-25, operatorAsFunctionJava.multiply(-5, 5))
        Assertions.assertEquals(-25, operatorAsFunctionJava.multiply(5, -5))
        Assertions.assertEquals(25, operatorAsFunctionJava.multiply(-5, -5))
    }
}