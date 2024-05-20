package Test;

import Problems.Problem1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1Test {

    @Test
    @DisplayName("Adding 2 + 2")
    void add() {
        assertEquals(4, new Problem1(2,2).Add());
    }

//    @Test
//    void subtract() {
//    }
//
//    @Test
//    void multiply() {
//    }
//
//    @Test
//    void divide() {
//    }
}