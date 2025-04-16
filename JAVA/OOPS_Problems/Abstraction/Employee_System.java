package JAVA.OOPS_Problems.Abstraction;

// Abstract class to demonstrate Abstraction
abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayDetails();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Employee extends Person {
    private double basicSalary;

    public Employee(String name, int id, double basicSalary) {
        super(name, id);
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}
public class Employee_System {
    public static void main(String[] args) {
        Manager manager = new Manager("Toto", 101, 50000, 10000);
        manager.displayDetails();
    }
}
