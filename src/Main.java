package src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = null;

        // Prompt the user to enter a date and time (application loop)
        do {
            System.out.println(
                    "Enter a date and time in the format 'yyyy-MM-dd HH:mm' or 'now' for the current date and time:");
            String input = scanner.nextLine();

            try {
                if (input.equalsIgnoreCase("now")) {
                    dateTime = LocalDateTime.now();
                } else {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                    dateTime = LocalDateTime.parse(input, formatter);
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date and time format. Please use the format 'yyyy-MM-dd HH:mm'.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } while (dateTime == null);

        TradeExecutor tradeExecutor = new TradeExecutor();
        tradeExecutor.executeTrade(dateTime);

        scanner.close();
    }
}
