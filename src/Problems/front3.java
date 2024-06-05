package Problems;

/**
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.
 *
 * front3("Java") → "JavJavJav"
 * front3("Chocolate") → "ChoChoCho"
 * front3("abc") → "abcabcabc"
 */
public class front3 {
    public String front3(String str) {
        int length = str.length();
        if (length <= 3) {return str + str + str;}

        char[] front = {str.charAt(0), str.charAt(1), str.charAt(2)};
        String output = "";

        for (int i = 0; i < 3; i++) {
            output += front[i];
        }

        return output + output + output;
    }

}
