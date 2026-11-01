import java.util.Scanner;

public class ExcellentResult {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput = Integer.parseInt(sc.nextLine());

        if (userInput >= 5) {
            System.out.println("Excellent!");
        }
    }
}