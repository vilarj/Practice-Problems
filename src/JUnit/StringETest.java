package JUnit;

import Problems.stringE;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringETest {

    @Test
    void stringE() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertTrue(new stringE().stringE("Hello"));
                    Assertions.assertTrue(new stringE().stringE("Heelle"));
                    Assertions.assertFalse(new stringE().stringE("Heelele"));
                    Assertions.assertFalse(new stringE().stringE("Hll"));
                    Assertions.assertTrue(new stringE().stringE("e"));
                    Assertions.assertFalse(new stringE().stringE(""));
                }
        );
    }
}