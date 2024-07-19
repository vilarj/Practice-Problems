package Problems;

/**
 * Return true if the given non-negative number is a multiple
 * of 3 or a multiple of 5.
 *
 * or35(3) → true
 * or35(10) → true
 * or35(8) → false
 */
public class Or35 {

    boolean isMultipleOr35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
