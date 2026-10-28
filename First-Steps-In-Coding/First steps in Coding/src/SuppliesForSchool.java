import java.util.Scanner;

public class SuppliesForSchool {
    static public void main(String[] args) {
        double pencils = 5.80;
        double markers = 7.20;
        double boardCleaner = 1.20;

        Scanner sc = new Scanner(System.in);

        int pencilsCount = Integer.parseInt(sc.nextLine());
        int markersCount = Integer.parseInt(sc.nextLine());
        int boardCleanerQuantity = Integer.parseInt(sc.nextLine());
        double discount = Integer.parseInt(sc.nextLine());

        double discountPercentage = discount / 100;
        double totalCostWithoutDiscount = (pencilsCount * pencils) + (markersCount * markers) + (boardCleanerQuantity * boardCleaner);
        double finalCost = totalCostWithoutDiscount - (totalCostWithoutDiscount * discountPercentage);

        System.out.println(finalCost);
    }
}
