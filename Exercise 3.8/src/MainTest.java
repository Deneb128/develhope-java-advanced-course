import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private OffsetDateTime testing = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void printDate() {
        assertEquals("1 marzo 2023", testing.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)), "expected \"1 marzo 2023\"");
    }

    @Test
    void printIncorrectDate() {
        //1 mar 2023 != 1 marzo 2023
        assertNotEquals("1 mar 2023", testing.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)), "expect diffent than \"1 mar 2023\"");
    }
}