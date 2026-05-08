package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumTest {

    Sum s = new Sum();

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, s.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, s.add(-2, -3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(7, s.add(7, 0));
    }

    @Test
    void testAddMixedNumbers() {
        assertEquals(1, s.add(3, -2));
    }
}