package JUnit;

import Problems.startHi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class startHiTest {

    @Test
    void startsWithHi() {
        Assertions.assertAll(() -> {
            Assertions.assertTrue(new startHi().StartsWithHi("hi there"));
            Assertions.assertFalse(new startHi().StartsWithHi(""));
            Assertions.assertTrue(new startHi().StartsWithHi("hi"));
            Assertions.assertFalse(new startHi().StartsWithHi("Hello there"));
            Assertions.assertTrue(new startHi().StartsWithHi("hi ho"));
            Assertions.assertFalse(new startHi().StartsWithHi("He"));
        });
    }
}