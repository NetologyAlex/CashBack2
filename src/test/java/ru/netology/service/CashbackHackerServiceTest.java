package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerServiceTest {
    @Test
    public void shouldCalculateFrom900() {
        CashbackHackerService service = new CashbackHackerService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldCalculateFrom0() {
        CashbackHackerService service = new CashbackHackerService();
        Assert.assertEquals(service.remain(0), 1000);
    }


}