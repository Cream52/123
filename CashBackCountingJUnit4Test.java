package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashBackCountingJUnit4Test {

    @Test
    public void shouldCalculateForAmount900AndGetExtra100() {
        CashBackCounting service = new CashBackCounting();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount0AndGetExtra1000() {
        CashBackCounting service = new CashBackCounting();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount1100AndGetExtra900() {
        CashBackCounting service = new CashBackCounting();
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount1000AndGetExtra0() {
        CashBackCounting service = new CashBackCounting();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount1500AndGetExtra500() {
        CashBackCounting service = new CashBackCounting();
        int expected = 500;
        int actual = service.remain(1500);
        assertEquals(expected, actual);
    }
}
