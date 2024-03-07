package entities;

public abstract class Employee implements CheckIn {
    protected int registrationNumber;
    protected double salary;
    protected Department department;


    public Employee(int registrationNumber, double salary) {
        this.registrationNumber = registrationNumber;
        this.salary = salary;
    }

    public Employee(int registrationNumber, double salary, Department department) {
        this(registrationNumber, salary);
        this.department = department;
    }

    public abstract void calculateSalary();

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
