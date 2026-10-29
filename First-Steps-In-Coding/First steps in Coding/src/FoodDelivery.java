import java.util.Scanner;

public class FoodDelivery {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;

        // dessert = 20% of the total order (without delivery)
        double delivery = 2.50; // calculated at the end

        int chickenMenusCount = Integer.parseInt(sc.nextLine());
        int fishMenuCount = Integer.parseInt(sc.nextLine());
        int vegetarianMenuCount = Integer.parseInt(sc.nextLine());

        double chickenMenuCost = chickenMenusCount * chickenMenu;
        double fishMenuCost = fishMenuCount * fishMenu;
        double vegeterianMenuCost = vegetarianMenuCount * vegetarianMenu;

        double dessert = (chickenMenuCost + fishMenuCost + vegeterianMenuCost) * 0.2;
        double totalCost = chickenMenuCost + fishMenuCost + vegeterianMenuCost + dessert + delivery;

        System.out.println(totalCost);
    }
}
