package EMPLOYEE_PAYROLL_SYSTEM;

abstract class Employee { //extendable class, achieving inheritance
    //abstraction,encapsulation
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    //encapsulation
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();

    //polymorphism (overriding method)
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id + "salary="+calculateSalary()+
                '}';
    }
}//abstract class is completed

//creating class for full time employee
//implementing inheritance concept
class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);//calling parent class constructor
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}//full time emp class completed

//crating class of part time employee

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hourlyRate;
    }
}
