public class Athlete {
    String type;

    public static void main(String[] args) {}

    public Athlete(String type) {
        this.type = type;
    }

    void print() {
        System.out.printf("\nYou are a %s.", type);
    }
}
