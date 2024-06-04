package JUnit;

import Problems.sortaSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortaSumTest {

    @Test
    void sortaSum() {
        sortaSum s = new sortaSum();

        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(7, s.sortaSum(3,4));
                    Assertions.assertEquals(20, s.sortaSum(9,4));
                    Assertions.assertEquals(21,s.sortaSum(10,11));
                    Assertions.assertEquals(9, s.sortaSum(12,-3));
                    Assertions.assertEquals(9, s.sortaSum(-3,12));
                    Assertions.assertEquals(9, s.sortaSum(4,5));
                    Assertions.assertEquals(20, s.sortaSum(4,6));
                    Assertions.assertEquals(21,s.sortaSum(14,7));
                    Assertions.assertEquals(20, s.sortaSum(14,6));
                }
        );
    }
}