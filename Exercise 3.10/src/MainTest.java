import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

class MainTest {
    private final static Main testingMain = new Main();
    private OffsetDateTime testingDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    @Test
    void addOneYear() {
        assertEquals(2024, testingDate.plusYears(1).getYear(), "expected 2024");
    }

    @Test
    void subtractOneMonth() {
        assertEquals(2, testingDate.minusMonths(1).getMonthValue(), "expected 2");
    }

    @Test
    void addSevenDays() {
        assertEquals(8, testingDate.plusDays(7).getDayOfMonth(), "expected 8");
    }

    @Test
    void printLocalized() {
        assertEquals("1 marzo 2023", testingDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)), "expected \"8 marzo 2023\"");
    }

    @Test
    void getLocalized() {
        assertEquals("1 marzo 2023", testingMain.getLocalizedString(testingDate), "expected \"8 marzo 2023\"");
    }

    @Test
    void doAll() {
        assertEquals("2024-02-08T13:00Z", testingMain.doAll(testingDate).toString(), "expected 8");
    }
}