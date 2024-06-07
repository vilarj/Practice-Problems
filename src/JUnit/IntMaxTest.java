package JUnit;

import Problems.intMax;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {

    @Test
    void intMax() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(3, new intMax().intMax(1,2,3));
                    Assertions.assertEquals(3, new intMax().intMax(1,3,2));
                    Assertions.assertEquals(3, new intMax().intMax(3,2,1));
                    Assertions.assertEquals(9, new intMax().intMax(9,3,3));
                    Assertions.assertEquals(9, new intMax().intMax(3,9,3));
                    Assertions.assertEquals(9, new intMax().intMax(3,3,9));
                    Assertions.assertEquals(8, new intMax().intMax(8,2,3));
                    Assertions.assertEquals(-1, new intMax().intMax(-3,-1,-2));
                    Assertions.assertEquals(6, new intMax().intMax(6,2,5));
                    Assertions.assertEquals(6, new intMax().intMax(5,6,2));
                    Assertions.assertEquals(6, new intMax().intMax(5,2,6));
                }
        );
    }
}