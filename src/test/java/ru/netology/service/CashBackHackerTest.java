package ru.netology.service;
import org.testng.Assert;
import ru.netology.service.CashbackHackService;
import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void fullAmountTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void boundaryMaxRemainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void equivalentRemainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void boundaryMinRemainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void boundaryZeroRemainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}
