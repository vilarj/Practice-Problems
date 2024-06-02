package JUnit;

import Problems.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("Addiction Test")
    void add() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(-21, new Calculator(0, -21).Add());
                    Assertions.assertEquals(-14, new Calculator(-2, -12).Add());
                    Assertions.assertEquals(4, new Calculator(2, 2).Add());
                    Assertions.assertEquals(0, new Calculator(-2, 2).Add());
                }
        );
    }

    @Test
    @DisplayName("Subtraction Test")
    void subtract() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(21, new Calculator(0, -21).Subtract());
                    Assertions.assertEquals(10, new Calculator(-2, -12).Subtract());
                    Assertions.assertEquals(0, new Calculator(2, 2).Subtract());
                    Assertions.assertEquals(-4, new Calculator(-2, 2).Subtract());
                }
        );
    }

    @Test
    @DisplayName("Multiplication Test")
    void multiply() {
        Assertions.assertAll(
            () -> {
                Assertions.assertEquals(4, new Calculator(2, 2).Multiply());
                Assertions.assertEquals(18, new Calculator(9, 2).Multiply());
                Assertions.assertEquals(0, new Calculator(0, 2).Multiply());
                Assertions.assertEquals(-230, new Calculator(-23, 10).Multiply());
            }
        );
    }

    @Test
    void divide() {
        Assertions.assertAll(
            () -> {
                Assertions.assertEquals(1, new Calculator(2, 2).Divide());
                Assertions.assertEquals(-1, new Calculator(-2, 2).Divide());
                Assertions.assertEquals(2, new Calculator(10, 5).Divide());
                Assertions.assertEquals(-1, new Calculator(1, 0).Divide());
            }
        );
    }
}