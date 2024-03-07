package entities;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int registrationNumber, double salary, Department department) {
        super(registrationNumber, salary, department);
    }

    @Override
    public void calculateSalary() {
        System.out.println("The salary is: " + salary);

    }

    @Override
    public void checkIn() {
        System.out.println("The full-time employee is checked in");
    }
}
