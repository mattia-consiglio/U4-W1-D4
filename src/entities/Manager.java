package entities;

public class Manager extends Employee {
    public Manager(int registrationNumber, double salary) {
        super(registrationNumber, salary);
        this.department = Department.ADMINISTRATION;
    }

    @Override
    public void calculateSalary() {
        System.out.println("The salary is: " + salary);
    }

    @Override
    public void checkIn() {
        System.out.println("The manager employee is checked in");
    }
}
