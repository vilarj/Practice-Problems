package Problems;

/**
 * Given a string, take the last char and return a new string
 * with the last char added at the front and back, so "cat"
 * yields "tcatt". The original string will be length 1 or more.
 *
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
 */
public class backAround {
    private static final String NOT_VALID_STRING = "Not valid String";

    public String backAround(String str) {
        if(IsValidString(str)) {
            return NOT_VALID_STRING;
        }

        return str.substring(str.length() -1) + str + str.substring(str.length() -1);
    }

    private boolean IsValidString(String str) {
        return str.isEmpty();
    }
}
