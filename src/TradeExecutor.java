package src;
import java.time.LocalDateTime;

public class TradeExecutor {
    private GSETradingChecker tradingHoursChecker;

    public TradeExecutor() {
        this.tradingHoursChecker = new GSETradingChecker();
    }

    public void executeTrade(LocalDateTime dateTime) {
        if (tradingHoursChecker.isMarketOpen(dateTime)) {
            System.out.println("Trade executed at " + dateTime);
        } else {
            System.out.println("Trade not executed, market closed " + dateTime);
        }
    }
}