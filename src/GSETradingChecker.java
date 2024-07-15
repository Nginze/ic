package src;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GSETradingChecker {
    private GhanaHolidayCalendar holidayCalendar;
    private GSETradingHours tradingHours;

    public GSETradingChecker() {
        this.holidayCalendar = new GhanaHolidayCalendar();
        this.tradingHours = new GSETradingHours();

        // Populate holiday calendar
        holidayCalendar.addHoliday(new Holiday("New Year’s Day", LocalDate.of(2024, 1, 1)));
        holidayCalendar.addHoliday(new Holiday("Constitution Day", LocalDate.of(2024, 1, 7)));
        holidayCalendar.addHoliday(new Holiday("Independence Day", LocalDate.of(2024, 3, 6)));
        holidayCalendar.addHoliday(new Holiday("Founders’ Day", LocalDate.of(2024, 8, 4)));
        holidayCalendar.addHoliday(new Holiday("Kwame Nkrumah Memorial Day", LocalDate.of(2024, 9, 21)));
        holidayCalendar.addHoliday(new Holiday("Farmer’s Day", LocalDate.of(2024, 12, 6)));
        holidayCalendar.addHoliday(new Holiday("Christmas Day", LocalDate.of(2024, 12, 25)));
        holidayCalendar.addHoliday(new Holiday("Boxing Day", LocalDate.of(2024, 12, 26)));
    }

    public boolean isMarketOpen(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        boolean isWeekday = day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
        boolean isHoliday = holidayCalendar.isHoliday(dateTime.toLocalDate());
        boolean isTradingHours = tradingHours.isTradingHours(dateTime.toLocalTime());

        return isWeekday && !isHoliday && isTradingHours;
    }
}