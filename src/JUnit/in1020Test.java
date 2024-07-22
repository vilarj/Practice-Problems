package JUnit;

import Problems.in1020;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class in1020Test {

    @Test
    void in1020() {
        Assertions.assertAll(() -> {
            Assertions.assertTrue(new in1020().in1020(12,99));
            Assertions.assertTrue(new in1020().in1020(21,12));
            Assertions.assertFalse(new in1020().in1020(8,99));
            Assertions.assertTrue(new in1020().in1020(99,10));
            Assertions.assertTrue(new in1020().in1020(20,20));
            Assertions.assertFalse(new in1020().in1020(21,21));
            Assertions.assertFalse(new in1020().in1020(9,9));
        });
    }
}