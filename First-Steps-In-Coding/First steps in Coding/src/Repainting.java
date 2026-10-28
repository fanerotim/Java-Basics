import java.util.Scanner;

public class Repainting {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double paintThinnerPrice = 5.00;

        double safetyPaintPercentage = 0.10;
        int additionalNylon = 2;
        double moneyForBags = 0.40;

        int requiredNylon = Integer.parseInt(sc.nextLine());
        int requiredPaint = Integer.parseInt(sc.nextLine());
        int requiredPaintThinner = Integer.parseInt(sc.nextLine());
        int timeNeededToRepaint = Integer.parseInt(sc.nextLine());

        double nylonCost = (requiredNylon + additionalNylon) * nylonPrice;
        double paintCost = (requiredPaint + requiredPaint * safetyPaintPercentage) * paintPrice;
        double paintThinnerCost = requiredPaintThinner * paintThinnerPrice;

        double materialsCost = nylonCost + paintCost + paintThinnerCost + moneyForBags;
        double hourlyRate = materialsCost * 0.3; //builders get paid 30% of the total cost for materials

        System.out.println(materialsCost + (timeNeededToRepaint * hourlyRate));
    }
}
