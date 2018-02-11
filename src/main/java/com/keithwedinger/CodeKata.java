package com.keithwedinger;

import java.util.Arrays;

/**
 * CodeKata solutions - see http://codekata.com/
 *
 * @author Keith Wedinger <br>
 * Created On: 2/11/18
 */

public class CodeKata {
    public int chop(int target, int[] values) {
        int index = 0;

        if (values.length == 0 || target > values[values.length - 1] || target < values[0]) {
            index = -1;
        } else if (values.length == 1) {
            index = (target == values[0] ? 0 : -1);
        } else {
            int mid = values.length / 2;
            if (target > values[mid]) {
                index = chop(target, Arrays.copyOfRange(values, mid, values.length));
                if (index != -1) {
                    index += mid;
                }
            } else if (target < values[mid]) {
                index = chop(target, Arrays.copyOfRange(values, 0, mid));
            } else {
                index = mid;
            }
        }

        return index;
    }
}
