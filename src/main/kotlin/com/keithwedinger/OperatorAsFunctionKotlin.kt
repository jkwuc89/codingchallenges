package com.keithwedinger

/**
 * Operator as a function
 *
 * @author Keith Wedinger <br>
 * Created On: 2/11/18
 */

class OperatorAsFunctionKotlin {
    fun multiply(lhs: Int, rhs: Int): Int {
        var product = 0
        val changeProductSign = (lhs < 0 && rhs > 0 || lhs > 0 && rhs < 0)
        val minFactor = Math.min(Math.abs(lhs), Math.abs(rhs))
        val maxFactor = Math.max(Math.abs(lhs), Math.abs(rhs))

        when (minFactor) {
            0 -> product = 0
            1 -> product = maxFactor
            else -> {
                for (i in 1..minFactor) {
                    product += maxFactor
                }
            }
        }

        if (changeProductSign) {
            product = 0 - product
        }

        return product
    }
}