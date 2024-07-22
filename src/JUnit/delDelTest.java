package JUnit;

import Problems.delDel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class delDelTest {

    @Test
    void delete() {
        Assertions.assertAll(() -> {
            Assertions.assertEquals("abc", new delDel().Delete("adelbc"));
            Assertions.assertEquals("aHello", new delDel().Delete("adelHello"));
            Assertions.assertEquals("adedbc", new delDel().Delete("adedbc"));
            Assertions.assertEquals("abcdel", new delDel().Delete("abcdel"));
            Assertions.assertEquals("add", new delDel().Delete("add"));
            Assertions.assertEquals("ad", new delDel().Delete("ad"));
            Assertions.assertEquals("a", new delDel().Delete("a"));
            Assertions.assertEquals("", new delDel().Delete(""));
            Assertions.assertEquals("del", new delDel().Delete("del"));
            Assertions.assertEquals("a", new delDel().Delete("adel"));
            Assertions.assertEquals("aadelbb", new delDel().Delete("aadelbb"));
        });
    }
}