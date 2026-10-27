import java.util.Scanner;

public class VacationBooksList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int pagesCount = Integer.parseInt(sc.nextLine());
        int pagesReadPerHour = Integer.parseInt(sc.nextLine());
        int daysCount = Integer.parseInt(sc.nextLine());

        int readingHours = pagesCount / pagesReadPerHour;
        int timeToReadPerDay = readingHours / daysCount;
        System.out.println(timeToReadPerDay);
    }
}
