package src;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class GSETradingChecker {
    private GhanaHolidayCalendar holidayCalendar;
    private GSETradingHours tradingHours;

    public GSETradingChecker() {
        this.holidayCalendar = new GhanaHolidayCalendar();
        this.tradingHours = new GSETradingHours();
    }

    public boolean isMarketOpen(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        boolean isWeekday = day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
        boolean isHoliday = holidayCalendar.isHoliday(dateTime.toLocalDate());
        boolean isTradingHours = tradingHours.isTradingHours(dateTime.toLocalTime());

        return isWeekday && !isHoliday && isTradingHours;
    }
}