import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the system with some sample Ghanaian holidays
        GhanaHolidayCalendar holidayCalendar = new GhanaHolidayCalendar();
        holidayCalendar.addHoliday(new Holiday("New Year's Day", LocalDate.of(2024, 1, 1)));
        // Add more holidays...

        // Allow the user to input a date and time or use the current date and time
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date and time in the format 'yyyy-MM-dd HH:mm' or 'now' for the current date and time:");
        String input = scanner.nextLine();

        ZonedDateTime dateTime;
        if (input.equalsIgnoreCase("now")) {
            dateTime = ZonedDateTime.now();
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            dateTime = ZonedDateTime.parse(input, formatter);
        }

        // Convert the input time to Ghana time (UTC+0)
        dateTime = dateTime.withZoneSameInstant(ZoneId.of("Africa/Accra"));

        // Attempt to execute a trade for the given date and time
        TradeExecutor tradeExecutor = new TradeExecutor();
        tradeExecutor.executeTrade(dateTime);

        // The result is displayed by the TradeExecutor
    }
}
