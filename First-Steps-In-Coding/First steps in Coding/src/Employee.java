public class Employee {
    public String name;
    public int age;
    public String occupation;

    public Employee(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.print();
    }

    public void print() {
        System.out.printf("Your name is %s. You are %s years old and your occupation is %s", this.name, this.age, this.occupation);
    }
}

public void main() {
    Employee employeeOne = new Employee("Petar", 38, "Junior developer and a new student");
}



