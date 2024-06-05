package JUnit;

import Problems.frontBack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FrontBackTest {

    @Test
    void frontBack() {
        frontBack f = new frontBack();

        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals("eodc", f.frontBack("code"));
                    Assertions.assertEquals("a", f.frontBack("a"));
                    Assertions.assertEquals("ab", f.frontBack("ba"));
                    Assertions.assertEquals("", f.frontBack(""));
                    Assertions.assertEquals("ehocolatC", f.frontBack("Chocolate"));
                    Assertions.assertEquals("Java", f.frontBack("aavJ"));
                    Assertions.assertEquals("oellh", f.frontBack("hello"));
                }
        );
    }
}