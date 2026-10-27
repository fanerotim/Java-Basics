import java.util.Scanner;

public class DepositCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double depositedSum = Double.parseDouble(scanner.nextLine());
        int depositLength = Integer.parseInt(scanner.nextLine());
        double yearlyInterest = Double.parseDouble(scanner.nextLine()) / 100;
        double finalSum = depositedSum + depositLength * ((depositedSum * yearlyInterest) / 12);
        System.out.println(finalSum);
    }
}