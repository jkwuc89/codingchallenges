package com.keithwedinger

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 *
 *
 * @author Keith Wedinger <br>
 * Created On: 1/19/18
 */

class CoderByteChallengesTest {
    private val coderByteChallenges = CoderByteChallenges()

    @Test
    internal fun `LetterChanges with mixed input`() {
        Assertions.assertEquals("gvO Ujnft!", coderByteChallenges.letterChanges("fun times!"))
    }
}