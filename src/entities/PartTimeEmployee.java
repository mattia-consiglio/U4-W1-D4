package entities;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;

    public PartTimeEmployee(int registrationNumber, double salary, Department department, int hoursWorked) {
        super(registrationNumber, salary, department);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("The salary is: " + salary * hoursWorked);
    }

    @Override
    public void checkIn() {
        System.out.println("The part-time employee is checked in");
    }
}
