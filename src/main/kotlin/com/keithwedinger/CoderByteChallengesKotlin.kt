package com.keithwedinger

/**
 * Kotlin version of CoderByteChallanges solutions
 *
 * @author Keith Wedinger <br>
 * Created On: 1/19/18
 */
class CoderByteChallengesKotlin {
    fun letterChanges(input: String): String {
        val lowerCaseVowels = charArrayOf('a', 'e', 'i', 'o', 'u')
        val inputChars = input.toCharArray()
        val changedChars = inputChars.map { currentChar ->
            when (currentChar) {
                in 'a'..'z', in 'A'..'Z' -> when (currentChar) {
                    'z' -> 'a'
                    'Z' -> 'A'
                    else -> {
                        val changedChar = (currentChar.toInt() + 1).toChar()
                        if (lowerCaseVowels.contains(changedChar)) {
                            Character.toUpperCase(changedChar)
                        } else {
                            changedChar
                        }
                    }
                }
                else -> currentChar
            }
        }
        return changedChars.joinToString("")
    }
}