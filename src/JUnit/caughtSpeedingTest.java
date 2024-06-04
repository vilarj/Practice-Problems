package JUnit;

import Problems.caughtSpeeding;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class caughtSpeedingTest {

    @DisplayName("Speeding Ticket Test")
    @Test
    void caughtSpeeding() {
        caughtSpeeding c = new caughtSpeeding();

        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(0, c.caughtSpeeding(60, false));
                    Assertions.assertEquals(1, c.caughtSpeeding(65, false));
                    Assertions.assertEquals(1, c.caughtSpeeding(80, false));
                    Assertions.assertEquals(0, c.caughtSpeeding(65, true));
                    Assertions.assertEquals(2, c.caughtSpeeding(85, false));
                }
        );
    }
}