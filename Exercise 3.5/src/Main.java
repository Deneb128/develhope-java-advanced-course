import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date1: " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)));
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println("Date2: " + date2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)));
        System.out.println(date2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)));
        System.out.println("Date1 before Date2: " + date1.isBefore(date2));
        System.out.println("Date2 after Date1: " + date2.isAfter(date1));
        System.out.println("Date1 equals now: " + date1.isEqual(OffsetDateTime.now()));
        System.out.println("Date1 before now: " + date2.isEqual(OffsetDateTime.now()));
    }
}