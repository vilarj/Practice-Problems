package JUnit;

import Problems.lastDigit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class lastDigitTest {

    @Test
    void lastDigit() {
        Assertions.assertAll(() -> {
            Assertions.assertTrue(new lastDigit().lastDigit(7, 17));
            Assertions.assertFalse(new lastDigit().lastDigit(6, 17));
            Assertions.assertFalse(new lastDigit().lastDigit(114, 113));
            Assertions.assertTrue(new lastDigit().lastDigit(3, 113));
            Assertions.assertTrue(new lastDigit().lastDigit(114, 4));
            Assertions.assertTrue(new lastDigit().lastDigit(10, 0));
            Assertions.assertFalse(new lastDigit().lastDigit(1, 0));
        });
    }
}