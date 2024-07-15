package src;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GhanaHolidayCalendar {
    private List<Holiday> holidays;

    public GhanaHolidayCalendar() {
        this.holidays = new ArrayList<>();
    }

    /**
     * The addHoliday function adds a Holiday object to a list of holidays.
     * 
     * @param holiday The `addHoliday` method takes a `Holiday` object as a parameter and adds it to a
     * collection called `holidays`.
     */
    public void addHoliday(Holiday holiday) {
        holidays.add(holiday);
    }

    /**
     * The function checks if a given date is a holiday by comparing it with a list of holiday dates.
     * 
     * @param date The `date` parameter is of type `LocalDate`, which represents a date without a time zone
     * in the ISO-8601 calendar system.
     * @return The method is returning a boolean value, either `true` if the input date is a holiday, or
     * `false` if it is not a holiday.
     */
    public boolean isHoliday(LocalDate date) {
        for (Holiday holiday : holidays) {
            if (holiday.getDate().equals(date)) {
                return true;
            }
        }
        return false;
    }
}
