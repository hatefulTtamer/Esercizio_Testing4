import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getDateYearTest() {
        int result = Main.getDateYear("2023-03-01T13:00:00Z");
        assertEquals(2023, result);
    }

    @Test
    void getDateMonthTest() {
        Month result = Main.getDateMonth("2023-03-01T13:00:00Z");
        assertEquals(Month.MARCH, result);
    }

    @Test
    void getDateMonthTest_whenMonthIsFebruary() {
        Month result = Main.getDateMonth("2023-02-01T13:00:00Z");
        assertEquals(Month.FEBRUARY, result);
    }

    @Test
    void getDateDayTest() {
        int result = Main.getDateDay("2023-03-01T13:00:00Z");
        assertEquals(1, result);
    }

    @Test
    void getDateDayOfWeekTest() {
        DayOfWeek result = Main.getDateDayOfWeek("2023-03-01T13:00:00Z");
        assertEquals(DayOfWeek.WEDNESDAY, result);
    }
}