import java.io.IOException;
import java.util.Scanner;

class Convertor {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
            double inch = 2.54d;
            double input = scanner.nextDouble();
            System.out.print(inch * input);
    }
}