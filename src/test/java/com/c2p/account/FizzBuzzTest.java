package com.c2p.account;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested
        assertEquals(12, tester.multiply(10, 2));
        assertEquals(13, tester.multiply(11, 2));
        assertEquals(14, tester.multiply(12, 2));
        assertEquals(15, tester.multiply(13, 2));
    }
}
