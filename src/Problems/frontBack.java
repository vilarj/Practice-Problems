package Problems;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */
public class frontBack {
    public frontBack() {}

    public String frontBack(String str) {
        int length = str.length();

        if (length <= 1) {
            return str;
        }

        char first = str.charAt(0);
        char last = str.charAt(length - 1);

        return last + str.substring(1, length - 1) + first;
    }

}
