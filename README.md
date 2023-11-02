# Junit Testing

Dalam Software Development Life Cycle, testing merupakan fase yang cukup penting. Dari fase ini kita akan mengetahui mutu dari aplikasi yang kita buat. 
Apakah aplikasi yang kita buat relevan dengan kebutuhan user, apakah aplikasi yang kita buat bebas dari bug, apakah aplikasi kita konsisten outputnya, 
dsb akan terjawab pada fase testing ini.

Pada bahasa pemrograman java, telah dibuat suatu library untuk menangani unit testing. Salah satu yang cukup mainstream yaitu JUnit.

Berikut Merupakan Cara untuk Memakai JUnit Testing

## 1.Tambahkan Dependencies pada pom.xml
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.0</version>
        </dependency>

Hal ini berfungsi untuk menambahkan library JUnit pada project yang sudah kalian buat

## 2. Tambahkan kode aplikasi

    public class calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
    }

## 3. Tambahkan Class Unit testing

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

## 4. jalankan Testing dengan mengklik tombol testing pada Class unit testin
