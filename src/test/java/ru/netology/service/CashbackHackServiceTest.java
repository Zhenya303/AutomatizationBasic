package ru.netology.service;

import ru.netology.CashbackHackService;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainTest(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void remainTestIfAmount900(){
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainTestIfAmount1100(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainTestIfAmount0(){
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

}
