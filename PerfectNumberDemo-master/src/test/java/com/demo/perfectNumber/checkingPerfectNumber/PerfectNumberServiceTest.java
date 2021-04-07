package com.demo.perfectNumber.checkingPerfectNumber;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumberServiceTest {

    @Spy
    @InjectMocks
    private PerfectNumberService perfectNumberService = new PerfectNumberService();

    @Test
    void isPerfectNumber_whenNumberIsPerfect() {

        final boolean isPerfectNumber = perfectNumberService.isPerfectNumber(28);
        assertTrue(isPerfectNumber);
    }

    @Test
    void isPerfectNumber_whenNumberIsNotPerfect() {

        final boolean isPerfectNumber = perfectNumberService.isPerfectNumber(9);
        assertFalse(isPerfectNumber);
    }

    @Test
    void findingPerfectNumbersInRange() {
        final ArrayList<Integer> integers = perfectNumberService.findingPerfectNumbersInRange("0-100");
        assertEquals(6, integers.get(0));
        assertEquals(28, integers.get(1));
    }
}