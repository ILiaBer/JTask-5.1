import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shoudCalculateRegistredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shoudCalculateRegistredOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 9999999;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateNotRegistredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 2000;
        boolean registered = false;
        long expected = 20;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test
    void shoudCalculateNotRegistredOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 199999;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}