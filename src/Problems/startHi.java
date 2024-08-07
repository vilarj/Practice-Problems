package Problems;

/**
 * Given a string, return true if the string starts
 * with "hi" and false otherwise.
 *
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 */
public class startHi {

    public boolean startsWithHi(String str) {
        if (str.length() < 2) {return false;}

        return str.contains("hi");
    }
}
