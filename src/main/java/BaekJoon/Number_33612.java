import java.time.LocalDate;
import java.util.Scanner;

public class Number_33612 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        LocalDate date = LocalDate.of(2024, 8, 1);
        LocalDate result = date.plusMonths((input - 1) * 7L);
        System.out.println(result.getYear() + " " + result.getMonthValue());
    }
}
