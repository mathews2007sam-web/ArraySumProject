
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraySumTest {

    @Test
    void testPositiveNumbers() {
        int[] numbers = {10, 20, 30, 40, 50};
        assertEquals(150, ArraySum.findSum(numbers));
    }

    @Test
    void testNegativeNumbers() {
        int[] numbers = {-10, 20, -5};
        assertEquals(5, ArraySum.findSum(numbers));
    }

    @Test
    void testEmptyArray() {
        int[] numbers = {};
        assertEquals(0, ArraySum.findSum(numbers));
    }
}
