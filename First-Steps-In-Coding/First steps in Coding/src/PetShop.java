import java.util.Scanner;

public class PetShop {
    static Scanner scanner = new Scanner(System.in);
    static double dogFoodCost = 2.5;
    static int catFoodCost = 4;

    public static void main(String[] args) {
        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());

        double totalCost = (dogFoodCount * dogFoodCost) + (catFoodCount * catFoodCost);
        System.out.printf("%f lv.", totalCost);
    }
}
