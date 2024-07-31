package Problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class endUpTest {

    @Test
    void endUp() {
        Assertions.assertAll(() -> {
            Assertions.assertEquals("HeLLO", new endUp().EndUp("Hello"));
            Assertions.assertEquals("hi thERE", new endUp().EndUp("hi there"));
            Assertions.assertEquals("HI", new endUp().EndUp("hi"));
            Assertions.assertEquals("woo HOO", new endUp().EndUp("woo hoo"));
            Assertions.assertEquals("xyZ12", new endUp().EndUp("xyz12"));
        });
    }
}