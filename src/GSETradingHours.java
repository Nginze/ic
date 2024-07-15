package src;
import java.time.LocalTime;

public class GSETradingHours {
    private static final LocalTime PRE_OPENING_START = LocalTime.of(9, 30);
    private static final LocalTime TRADING_START = LocalTime.of(10, 0);
    private static final LocalTime TRADING_END = LocalTime.of(15, 0);

    public boolean isTradingHours(LocalTime time) {
        return ((time.isAfter(PRE_OPENING_START) && time.isBefore(TRADING_END))
                || time.equals(TRADING_START) || time.equals(TRADING_END));
    }
}
