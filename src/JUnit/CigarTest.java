package JUnit;

import Problems.cigarParty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CigarTest {

    @Test
    @DisplayName("Cigar Test")
    void cigars() {
        cigarParty c = new cigarParty();

        Assertions.assertAll(
                () -> {
                    Assertions.assertFalse(c.cigars(30, false));
                    Assertions.assertTrue(c.cigars(50, false));
                    Assertions.assertTrue(c.cigars(70, true));
                    Assertions.assertFalse(c.cigars(30, true));
                    Assertions.assertTrue(c.cigars(50, true));
                    Assertions.assertTrue(c.cigars(60, false));
                    Assertions.assertFalse(c.cigars(61, false));
                    Assertions.assertTrue(c.cigars(40, true));
                    Assertions.assertFalse(c.cigars(39, false));
                    Assertions.assertTrue(c.cigars(40, true));
                    Assertions.assertFalse(c.cigars(39, false));
                }
        );
    }
}