package JUnit;

import Problems.front3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front3Test {

    @DisplayName("Front3 Test")
    @Test
    void front3() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals("JavJavJav", new front3().front3("Java"));
                    Assertions.assertEquals("ChoChoCho", new front3().front3("Chocolate"));
                    Assertions.assertEquals("abcabcabc", new front3().front3("abcabcabc"));
                    Assertions.assertEquals("abcabcabc", new front3().front3("abcXYZ"));
                    Assertions.assertEquals("ababab", new front3().front3("ab"));
                    Assertions.assertEquals("aaa", new front3().front3("a"));
                    Assertions.assertEquals("", new front3().front3(""));
                }
        );
    }
}