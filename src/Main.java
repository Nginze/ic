package src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Enter a date and time in the format 'yyyy-MM-dd HH:mm' or 'now' for the current date and time:");
        String input = scanner.nextLine();

        LocalDateTime dateTime;
        if (input.equalsIgnoreCase("now")) {
            dateTime = LocalDateTime.now();
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            dateTime = LocalDateTime.parse(input, formatter);
        }

        TradeExecutor tradeExecutor = new TradeExecutor();
        tradeExecutor.executeTrade(dateTime);

        scanner.close();
    }
}
