package JUnit;

import Problems.dateFashion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DateFashionTest {
    @Test
    @DisplayName("Fashion Test")
    void fashion() {
        dateFashion d = new dateFashion();

        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(2, d.fashion(5, 10));
                    Assertions.assertEquals(0, d.fashion(5, 2));
                    Assertions.assertEquals(1, d.fashion(5, 5));
                    Assertions.assertEquals(1, d.fashion(3, 3));
                    Assertions.assertEquals(0, d.fashion(10, 2));
                    Assertions.assertEquals(0, d.fashion(2, 9));
                    Assertions.assertEquals(2, d.fashion(9, 9));
                    Assertions.assertEquals(2, d.fashion(10, 5));
                    Assertions.assertEquals(0, d.fashion(2, 2));
                    Assertions.assertEquals(1, d.fashion(3, 7));
                    Assertions.assertEquals(0, d.fashion(2, 7));
                    Assertions.assertEquals(0, d.fashion(6, 2));
                }
        );
    }
}