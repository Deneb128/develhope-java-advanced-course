import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

class MainTest {
    private final OffsetDateTime testing = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void getYear() {
        assertEquals(2023, testing.getYear(), "expected 2023");
    }

    @Test
    void getMonth() {
        assertEquals("marzo", testing.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY), "expected \"marzo\"");
    }

    @Test
    void getDay() {
        assertEquals(1, testing.getDayOfMonth(), "expected 1");
    }

    @Test
    void getDayOfWeek() {
        assertEquals("mercoledì", testing.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ITALY), "expected \"mercoledì\"");
    }
}