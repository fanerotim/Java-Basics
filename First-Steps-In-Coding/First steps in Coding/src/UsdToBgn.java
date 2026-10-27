import java.util.Scanner;

public class UsdToBgn {
    static Scanner scanner = new Scanner(System.in);
    static double USD_EXCHANGE_RATE = 1.79549;

    public static void main(String[] args) {
        double levsToExchange = Double.parseDouble(scanner.nextLine());
        System.out.println(levsToExchange * USD_EXCHANGE_RATE);
    }
}
