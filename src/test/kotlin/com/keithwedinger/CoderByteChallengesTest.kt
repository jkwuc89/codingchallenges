package com.keithwedinger

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Tests for CoderByteChallenges and CoderByteChallengesKotlin
 *
 * @author Keith Wedinger <br>
 * Created On: 1/19/18
 */

class CoderByteChallengesTest {
    private val coderByteChallenges = CoderByteChallenges()
    private val coderByteChallengesKotlin = CoderByteChallengesKotlin()

    @Test
    internal fun `Java letterChanges with mixed input`() {
        Assertions.assertEquals("gvO Ujnft!", coderByteChallenges.letterChanges("fun times!"))
    }

    @Test
    internal fun `Kotlin letterChanges with mixed input`() {
        Assertions.assertEquals("gvO Ujnft!", coderByteChallengesKotlin.letterChanges("fun times!"))
    }

    @Test
    internal fun `longestWord`() {
        Assertions.assertEquals("sentence", coderByteChallenges.longestWord("this is some sort of sentence"))
        // Assertions.assertEquals("hello", coderByteChallenges.longestWord("hello world"))
    }
}