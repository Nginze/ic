package src;
import java.time.LocalTime;

public class GSETradingHours {
    private static final LocalTime PRE_OPENING_START = LocalTime.of(9, 30);
    private static final LocalTime TRADING_START = LocalTime.of(10, 0);
    private static final LocalTime TRADING_END = LocalTime.of(15, 0);

    /**
     * The function `isTradingHours` checks if a given `LocalTime` falls within a specified trading time
     * range.
     * 
     * @param time The `time` parameter represents a specific time of day, typically in the `LocalTime`
     * format. This method `isTradingHours` checks if the given time falls within the trading hours.
     * @return The method isTradingHours returns a boolean value, indicating whether the given time falls
     * within the trading hours.
     */
    public boolean isTradingHours(LocalTime time) {
        return ((time.isAfter(TRADING_START) && time.isBefore(TRADING_END))
                || time.equals(TRADING_START) || time.equals(TRADING_END));
    }
}
