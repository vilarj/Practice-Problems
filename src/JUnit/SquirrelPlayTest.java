package JUnit;

import Problems.squirrelPlay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SquirrelPlayTest {

    @Test
    @DisplayName("Squirrel Summer Play")
    void squirrelPlay() {
        squirrelPlay p = new squirrelPlay();

        Assertions.assertAll(
                () -> {
                    Assertions.assertTrue(p.squirrelPlay(70, false));
                    Assertions.assertFalse(p.squirrelPlay(95, false));
                    Assertions.assertTrue(p.squirrelPlay(95, true));
                    Assertions.assertTrue(p.squirrelPlay(90, false));
                }
            );
    }
}