public class GreetingByName {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Hello, " + name + "!");
        String name = IO.readln();
        System.out.printf("Hello, %s", name);
    }
}
