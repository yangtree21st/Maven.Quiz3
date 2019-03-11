package rocks.zipcode.io.quiz3.arrays;

import static java.lang.Math.*;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        if (input.length == squaredValues.length) {
            for (int i = 0; i < input.length; i++) {
                for(int j = 0; j< squaredValues.length; j++ )
                if (pow(input[i], 2) == squaredValues[j]) {
                    return true;
                }

            }


        }
        return false;
    }
}
