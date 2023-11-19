import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Year: " + getYear(date));
        System.out.println("Month: " + getMonth(date));
        System.out.println("Day: " + getDay(date));
        System.out.println("Day of Week: " + getDayOfWeek(date));
    }

    public static int getYear(OffsetDateTime date){
        return date.getYear();
    }

    public static String getMonth(OffsetDateTime date){
        return date.getMonth().getDisplayName(TextStyle.FULL,Locale.ITALY).toString();
    }

    public static int getDay(OffsetDateTime date){
        return date.getDayOfMonth();
    }

    public static String getDayOfWeek(OffsetDateTime date){
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ITALY).toString();
    }
}