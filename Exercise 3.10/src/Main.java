import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        printLocalized(date);
        printLocalized(doAll(date));
    }

    public static OffsetDateTime addOneYear(OffsetDateTime date){
        return date.plusYears(1);
    }

    public static OffsetDateTime doAll(OffsetDateTime date) {
        return addSevenDays(subtractOneMonth(addOneYear(date)));
    }

    public static OffsetDateTime subtractOneMonth(OffsetDateTime date){
        return date.minusMonths(1);
    }

    public static OffsetDateTime addSevenDays(OffsetDateTime date){
        return date.plusDays(7);
    }

    public static void printLocalized(OffsetDateTime date)
    {
        System.out.println(getLocalizedString(date));
    }

    public static String getLocalizedString(OffsetDateTime date){
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(Locale.ITALY));
    }
}