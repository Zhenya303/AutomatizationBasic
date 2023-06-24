package ru.netology.service;

import ru.netology.CashbackHackService;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remainTest(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void remainTestIfAmount900(){
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void remainTestIfAmount1100(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void remainTestIfAmount0(){
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);
    }

}
