package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJUnit4 {
    //Общие данные:
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBelowLimit() {
        int amount = 750;

        int actual = service.remain(amount);
        int expected = 250;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveLimit() {
        int amount = 1_250;

        int actual = service.remain(amount);
        int expected = 750;

        assertEquals(expected, actual);
    }
}