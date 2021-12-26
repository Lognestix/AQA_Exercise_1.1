package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    //Общие данные:
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBelowLimit() {
        int amount = 750;

        int actual = service.remain(amount);
        int expected = 250;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAboveLimit() {
        int amount = 1_250;

        int actual = service.remain(amount);
        int expected = 750;

        assertEquals(actual, expected);
    }
}