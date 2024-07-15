package src;
import java.time.LocalDate;

public class Holiday {
    private String name;
    private LocalDate date;

    public Holiday(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    /**
     * The `getName` function in Java returns the value of the `name` variable.
     * 
     * @return The `name` variable is being returned.
     */
    public String getName() {
        return name;
    }

    /**
     * The function sets the name of an object to the provided name parameter.
     * 
     * @param name The parameter "name" is a String type parameter that represents the name to be set for
     * an object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The function `getDate()` returns a `LocalDate` object.
     * 
     * @return A `LocalDate` object is being returned.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * The function `setDate` sets the date for a given object.
     * 
     * @param date The `date` parameter is of type `LocalDate`, which is a class in Java that represents a
     * date without a time component.
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
