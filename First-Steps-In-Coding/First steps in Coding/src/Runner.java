public class Runner extends Athlete {
    String discipline;

    public static void main(String[] args) {
        Athlete athleteOne = new Athlete("runner", "Petar");
        System.out.println(athleteOne.getAthlete());

        Runner runnerOne = new Runner("Long distance runner", "runner", "Petar");
        runnerOne.print(runnerOne.getAthlete(), runnerOne.getName());
    }

    public Runner(String discipline, String type, String name) {
        super(type, name);
        this.discipline = discipline;
    }

    public void print(String type, String name) {
        System.out.printf("You are a %s by the name of %s and I have overridden the print method of Athlete.", type, name);
    }

    public String getDiscipline() {
        return this.discipline;
    }
}
