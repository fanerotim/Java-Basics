public class SwitchExpression {
    public static void main(String[] args) {
        int age = 17;

        Boolean isAllowed = checkAge(age);

        System.out.println(isAllowed);
    }

    public static Boolean checkAge(int age) {

        Boolean canEnter =
                switch(age) {
            case 18 -> true;
            case 17 -> false;
            default -> throw new IllegalStateException("Unexpected value: " + age);
                };

        return canEnter;
    }
}
