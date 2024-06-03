package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashBackCountingTestNGTest {

    @Test
    public void shouldCalculateForAmount900AndGetExtra100() {
        CashBackCounting service = new CashBackCounting();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateForAmount0AndGetExtra1000() {
        CashBackCounting service = new CashBackCounting();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateForAmount1100AndGetExtra900() {
        CashBackCounting service = new CashBackCounting();
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateForAmount1000AndGetExtra0() {
        CashBackCounting service = new CashBackCounting();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateForAmount1500AndGetExtra500() {
        CashBackCounting service = new CashBackCounting();
        int expected = 500;
        int actual = service.remain(1500);
        assertEquals(actual, expected);
    }
}
