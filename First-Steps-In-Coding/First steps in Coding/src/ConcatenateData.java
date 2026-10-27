import java.util.Scanner;

public class ConcatenateData {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Please enter your first name, last name, age and home town");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.format("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
