import java.time.*;
import java.time.format.*;
import java.util.*;

public class TimeIntervalCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        while (true) {
            System.out.print("Enter start time (HH:MM): ");
            String startTime = scanner.nextLine();
            System.out.print("Enter end time (HH:MM): ");
            String endTime = scanner.nextLine();

            try {
                LocalTime start = LocalTime.parse(startTime, formatter);
                LocalTime end = LocalTime.parse(endTime, formatter);
                LocalTime current = LocalTime.now();

                if (isTimeBetween(current, start, end)) {
                    System.out.println("Correct time! Exiting program.");
                    break;
                } else {
                    System.out.println("System time is not in the interval. Try again.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid input format. Please use HH:MM.");
            }
        }

        scanner.close();
    }

    private static boolean isTimeBetween(LocalTime current, LocalTime start, LocalTime end) {
        if (start.isBefore(end)) {
            return !current.isBefore(start) && !current.isAfter(end);
        } else {
            return !current.isBefore(start) || !current.isAfter(end);
        }
    }
}
