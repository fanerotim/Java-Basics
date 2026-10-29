import java.util.Scanner;

public class BasketballEquipment {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double sneakersPercentage = 0.6; //40% of the yearly subscription fee
        double equipmentPercentage = 0.8; //20% cheaper than the cost of sneakers
        double ballPercentage = 0.25; //1/4 of the cost of the equipment
        double accessoriesPercentage = 0.2; //20% of the cost of the ball

        int yearlySubscriptionFee = Integer.parseInt(sc.nextLine());

        double sneakersCost = yearlySubscriptionFee * sneakersPercentage;
        double equipmentCost = sneakersCost * equipmentPercentage;
        double ballCost = equipmentCost * ballPercentage;
        double accessoriesCost = ballCost * accessoriesPercentage;

        double totalCost = sneakersCost + equipmentCost + ballCost + accessoriesCost + yearlySubscriptionFee;

        System.out.println(totalCost);
    }
}
