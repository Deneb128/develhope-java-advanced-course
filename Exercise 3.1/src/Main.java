import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }
}