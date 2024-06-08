package JUnit;

import Problems.in3050;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In3050Test {

    @Test
    void in3050() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertTrue(new in3050().in3050(30, 31));
                    Assertions.assertFalse(new in3050().in3050(30, 41));
                    Assertions.assertTrue(new in3050().in3050(40, 50));
                    Assertions.assertFalse(new in3050().in3050(40, 51));
                    Assertions.assertFalse(new in3050().in3050(39, 50));
                }
        );
    }
}