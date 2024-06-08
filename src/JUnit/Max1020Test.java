package JUnit;

import Problems.max1020;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max1020Test {

    @Test
    void max1020() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(19, new max1020().max1020(11, 19));
                    Assertions.assertEquals(19, new max1020().max1020(19, 11));
                    Assertions.assertEquals(11, new max1020().max1020(11, 9));
                    Assertions.assertEquals(0, new max1020().max1020(9, 21));
                }
        );
    }
}