public static class Person {
    public String nationality;

    public Person(String nationality) {
        this.nationality = nationality;
    }
}

public class Employee extends Person {
    public String name;
    public int age;
    public String occupation;

    public Employee(String name, int age, String occupation, String nationality) {
        super(nationality);
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.print();
    }

    public void print() {
        System.out.printf("Your name is %s. You are %s years old and your occupation is %s and you are %s.", this.name, this.age, this.occupation, this.nationality);
    }
}

public void main() {
    Employee employeeOne = new Employee("Petar", 38, "Junior developer and a new student", "Bulgarian");
    Athlete athleteOne = new Athlete("long distance runner");
    athleteOne.print();
}



