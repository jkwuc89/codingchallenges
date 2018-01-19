package com.keithwedinger

/**
 * Kotlin version of CoderByteChallanges solutions
 *
 * @author Keith Wedinger <br>
 * Created On: 1/19/18
 */
class CoderByteChallengesKotlin {
    private fun changeChar(inputChar: Char): Char {
        val lowerCaseVowels = charArrayOf('a', 'e', 'i', 'o', 'u')
        return when (inputChar) {
            in 'a'..'z', in 'A'..'Z' -> when (inputChar) {
                'z' -> 'a'
                'Z' -> 'A'
                else -> {
                    val changedChar = (inputChar.toInt() + 1).toChar()
                    if (lowerCaseVowels.contains(changedChar)) {
                        Character.toUpperCase(changedChar)
                    } else {
                        changedChar
                    }
                }
            }
            else -> inputChar
        }
    }

    fun letterChanges(input: String): String {
        return input.toCharArray().map { changeChar(it) }.joinToString("")
    }
}