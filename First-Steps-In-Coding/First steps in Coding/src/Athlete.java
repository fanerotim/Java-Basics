public class Athlete {
    private String type;
    private String name;

    public static void main(String[] args) {}

    public Athlete(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void print() {
        System.out.printf("\nYou are a %s and your name is %s.", type, name);
    }

    public String getAthlete() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }
}
