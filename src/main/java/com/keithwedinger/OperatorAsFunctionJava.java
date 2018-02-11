package com.keithwedinger;

/**
 * Operator as a function
 *
 * @author Keith Wedinger <br>
 * Created On: 2/11/18
 */

public class OperatorAsFunctionJava {
    public int multiply(int lhs, int rhs) {
        int product = 0;
        boolean changeProductSign = ((lhs < 0 && rhs > 0) || (lhs > 0 && rhs < 0));
        int minFactor = Math.min(Math.abs(lhs), Math.abs(rhs));
        int maxFactor = Math.max(Math.abs(lhs), Math.abs(rhs));

        switch(minFactor) {
            case 0:
                product = 0;
                break;
            case 1:
                product = maxFactor;
                break;
            default:
                for (int i = 1; i <= minFactor; i++) {
                    product += maxFactor;
                }
        }

        if (changeProductSign) {
            product = 0 - product;
        }

        return product;
    }
}
