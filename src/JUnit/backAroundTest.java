package Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class backAroundTest {

    @Test
    void backAround() {
        String notValidString = "Not valid String";

        Assertions.assertAll(() -> {
            Assertions.assertEquals(notValidString, new backAround().backAround(""));
            Assertions.assertNotEquals("", new backAround().backAround(""));
            Assertions.assertEquals("tcatt", new backAround().backAround("cat"));
            Assertions.assertEquals("oHelloo", new backAround().backAround("Hello"));
            Assertions.assertEquals("aaa", new backAround().backAround("a"));
            Assertions.assertEquals("cabcc", new backAround().backAround("abc"));
            Assertions.assertEquals("dreadd", new backAround().backAround("read"));
            Assertions.assertEquals("obooo", new backAround().backAround("boo"));
        });
    }
}