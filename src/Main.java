import entities.*;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(123456, 5000, Department.SALES);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(345678, 25, Department.PRODUCTION, 50);
        Manager manager = new Manager(901234, 100000);
        Volunteer volunteer = new Volunteer("John", 25, "CV");
        Employee[] employee = {fullTimeEmployee, partTimeEmployee, manager};
        for (Employee e : employee) {
            System.out.println("Employee registration number: " + e.getRegistrationNumber());

            e.calculateSalary();
        }
        System.out.println("----------------------------------------");
        CheckIn[] checkIn = {fullTimeEmployee, partTimeEmployee, manager, volunteer};
        for (CheckIn c : checkIn) {
            c.checkIn();
        }
    }
}