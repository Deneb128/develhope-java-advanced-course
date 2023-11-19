import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)));
        date = date.plusYears(1);
        date = date.minusMonths(1);
        date = date.plusDays(7);
        System.out.println("----------------");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY)));

    }
}