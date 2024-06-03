package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackCountingTest {

    @Test
    public void testRemain() {
        CashBackCounting cashBackCounting = new CashBackCounting();

        assertEquals(1000, cashBackCounting.remain(0));
        assertEquals(100, cashBackCounting.remain(900));
        assertEquals(900, cashBackCounting.remain(1100));
        assertEquals(0, cashBackCounting.remain(1000));
        assertEquals(500, cashBackCounting.remain(1500));
    }
}
