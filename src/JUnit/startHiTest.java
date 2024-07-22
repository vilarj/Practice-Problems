package JUnit;

import Problems.startHi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class startHiTest {

    @Test
    void startsWithHi() {
        Assertions.assertAll(() -> {
            Assertions.assertTrue(new startHi().startsWithHi("hi there"));
            Assertions.assertFalse(new startHi().startsWithHi(""));
            Assertions.assertTrue(new startHi().startsWithHi("hi"));
            Assertions.assertFalse(new startHi().startsWithHi("Hello there"));
            Assertions.assertTrue(new startHi().startsWithHi("hi ho"));
            Assertions.assertFalse(new startHi().startsWithHi("He"));
        });
    }
}