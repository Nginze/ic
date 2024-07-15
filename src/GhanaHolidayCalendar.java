package src;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GhanaHolidayCalendar {
    private List<Holiday> holidays;

    public GhanaHolidayCalendar() {
        this.holidays = new ArrayList<>();
    }

    public void addHoliday(Holiday holiday) {
        holidays.add(holiday);
    }

    public boolean isHoliday(LocalDate date) {
        for (Holiday holiday : holidays) {
            if (holiday.getDate().equals(date)) {
                return true;
            }
        }
        return false;
    }
}
