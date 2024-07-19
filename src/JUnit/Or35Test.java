package JUnit;

import Problems.Or35;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Or35Test {

    @Test
    void isMultipleOr35() {
        Assertions.assertAll(() -> {
            Assertions.assertTrue(new Or35().isMultipleOr35(3));
            Assertions.assertTrue(new Or35().isMultipleOr35(5));
            Assertions.assertTrue(new Or35().isMultipleOr35(10));
            Assertions.assertTrue(new Or35().isMultipleOr35(30));
            Assertions.assertTrue(new Or35().isMultipleOr35(50));

            Assertions.assertFalse(new Or35().isMultipleOr35(1));
            Assertions.assertFalse(new Or35().isMultipleOr35(2));
            Assertions.assertFalse(new Or35().isMultipleOr35(4));
            Assertions.assertFalse(new Or35().isMultipleOr35(7));
            Assertions.assertFalse(new Or35().isMultipleOr35(97));
        });
    }
}