package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    //Method yang digunakan untuk penjumlahan
    @Test
    @DisplayName("Add two numbers")

    //void add() merupakan method untuk melakukan penjumlahan
    //asssertEquals merupakan asersi (pemasukan) yang memeriksa apakah hasil sama dengan ekspektasi (2+2 = 4)
    void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    //Method yang digunakan untuk perkalian
    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, calculator.multiply(2, 2)),
                () -> assertEquals(-4, calculator.multiply(2, -2)),
                () -> assertEquals(4, calculator.multiply(-2, -2)),
                () -> assertEquals(0, calculator.multiply(1, 0)));

        //assertAll(): Ini adalah metode yang digunakan untuk mengelompokkan beberapa asersi (assertions) bersama-sama.
        //Dalam kode tersebut, kita ingin melakukan beberapa asersi dalam satu metode pengujian, jadi assertAll digunakan untuk mengelompokkannya.
        //Ada tiga asersi tambahan yang melakukan hal yang sama untuk berbagai kombinasi angka positif dan negatif serta perkalian dengan 0.
    }
}