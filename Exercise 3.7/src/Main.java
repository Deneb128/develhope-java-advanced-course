import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        printDateFull();
        printDateMedium();
        printDateShort();
    }

    public static void printDateFull() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.ITALY)));
    }

    public static void printDateMedium() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(Locale.ITALY)));
    }

    public static void printDateShort() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(Locale.ITALY)));
    }
}