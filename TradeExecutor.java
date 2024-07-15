import java.time.ZonedDateTime;
import java.util.logging.Logger;

public class TradeExecutor {
    private static final Logger LOGGER = Logger.getLogger(TradeExecutor.class.getName());
    private GSETradingHours tradingHoursChecker;

    public TradeExecutor() {
        this.tradingHoursChecker = new GSETradingHours();
    }

    public void executeTrade(ZonedDateTime dateTime) {
        if (tradingHoursChecker.isTradingHours(dateTime)) {
            // Simulate trade execution
            LOGGER.info("Trade executed at " + dateTime);
        } else {
            LOGGER.info("Trade not executed. The Ghana Stock Exchange is closed at " + dateTime);
        }
    }
}