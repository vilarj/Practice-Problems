package JUnit;

import Problems.icyHot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class icyHotTest {

    @Test
    void isIcyHot() {
        Assertions.assertAll(() -> {
            Assertions.assertTrue(new icyHot().isIcyHot(120, -1));
            Assertions.assertTrue(new icyHot().isIcyHot(-1, 120));
            Assertions.assertFalse(new icyHot().isIcyHot(2, 120));
            Assertions.assertFalse(new icyHot().isIcyHot(-1, 100));
            Assertions.assertFalse(new icyHot().isIcyHot(-2, -2));
            Assertions.assertFalse(new icyHot().isIcyHot(120, 120));
        });
    }
}