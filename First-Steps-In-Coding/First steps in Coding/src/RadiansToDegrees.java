import java.util.Scanner;

public class RadiansToDegrees {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double radians = Double.parseDouble(scanner.nextLine());
        System.out.println((radians * 180) / Math.PI);
    }
}
