package src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TradeExecutor {
    private GSETradingChecker tradingHoursChecker;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a 'on' EEEE dd MMMM yyyy");

    public TradeExecutor() {
        this.tradingHoursChecker = new GSETradingChecker();
    }

    /**
     * The `executeTrade` function checks if the market is open at a given `LocalDateTime` and prints a
     * message accordingly.
     * 
     * @param dateTime The `dateTime` parameter is an instance of the `LocalDateTime` class, representing a
     * date and time without a time zone.
     */
    public void executeTrade(LocalDateTime dateTime) {
        String formattedDateTime = dateTime.format(this.formatter);

        if (tradingHoursChecker.isMarketOpen(dateTime)) {
            System.out.println("Trade executed at " + formattedDateTime);
        } else {
            System.out.println("Trade not executed, market closed " + formattedDateTime);
        }
    }
}