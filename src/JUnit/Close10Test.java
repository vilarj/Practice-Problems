package JUnit;

import Problems.close10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Close10Test {

    @Test
    void close10() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(8, new close10().close10(8,13));
                    Assertions.assertEquals(8, new close10().close10(13,8));
                    Assertions.assertEquals(0, new close10().close10(13,7));
                    Assertions.assertEquals(0, new close10().close10(7,13));
                    Assertions.assertEquals(9, new close10().close10(9,13));
                    Assertions.assertEquals(8, new close10().close10(13,8));
                    Assertions.assertEquals(10, new close10().close10(10,12));
                    Assertions.assertEquals(10, new close10().close10(11,10));
                    Assertions.assertEquals(5, new close10().close10(5,21));
                    Assertions.assertEquals(0, new close10().close10(0,20));
                    Assertions.assertEquals(0, new close10().close10(10,10));
                }
        );
    }
}