import java.util.Scanner;

public class ProjectsCreation {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String architectName = scanner.nextLine();
        int projectCount = Integer.parseInt(scanner.nextLine());
        System.out.format("The architect %s will need %d hours to complete %d project/s.", architectName, projectCount * 3, projectCount);
    }
}
