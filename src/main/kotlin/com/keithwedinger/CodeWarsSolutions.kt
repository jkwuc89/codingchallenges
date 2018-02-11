package com.keithwedinger

/**
 * CodeWars solutions
 *
 * @author Keith Wedinger <br>
 * Created On: 1/19/18
 */

class CodeWarsSolutions {

    /**
     * Two Oldest Ages
     */
    fun twoOldestAges(ages: List<Int>): List<Int> {
        val sortedAges = ages.sorted()
        return listOf(sortedAges.elementAt(ages.size - 2), sortedAges.elementAt(ages.size - 1))
    }
}