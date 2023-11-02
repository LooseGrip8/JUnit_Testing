package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, calculator.multiply(2, 2)),
                () -> assertEquals(-4, calculator.multiply(2, -2)),
                () -> assertEquals(4, calculator.multiply(-2, -2)),
                () -> assertEquals(0, calculator.multiply(1, 0)));
    }
}