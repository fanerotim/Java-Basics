import java.util.Scanner;

public class YardGreening {
    static double discount = 0.18;
    static double costPerSquareMeter = 7.61;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sqMetersToBeGreened = Double.parseDouble(scanner.nextLine());

        double totalCost = sqMetersToBeGreened * costPerSquareMeter;
        double discountedSum = totalCost - (totalCost * discount);
        double savedMoney = totalCost - discountedSum;

        System.out.printf("The final price is: %f lv.", discountedSum);
        System.out.printf("\nThe discount is: %f lv.", savedMoney);
    }
}
