import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private OffsetDateTime testing = OffsetDateTime.parse("2002-03-01T13:00:00Z");
    @Test
    void printDateFull() {
        assertEquals("venerdì 1 marzo 2002", testing.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.ITALY)));
    }

    @Test
    void printDateMedium() {
        assertEquals("1 mar 2002", testing.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(Locale.ITALY)));
    }

    @Test
    void printDateShort() {
        assertEquals("01/03/02", testing.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(Locale.ITALY)));
    }
}