package EMPLOYEE_PAYROLL_SYSTEM;

import java.util.ArrayList;

abstract class Employee { //extendable class, achieving inheritance
    //abstraction,encapsulation
    private String name;
    private int id;

    public Employee(String name, int id) {//constructor
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
                ", id= " + id + " salary = "+calculateSalary()+
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

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {//constructor
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }//end constructor

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}//end PartTimeEmployee class

class PayrollSystem{
    private ArrayList<Employee> employeeList;
    public PayrollSystem(){ //constructor
        employeeList = new ArrayList<>();
    }//end constructor

    //method to adding employee
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    //method to remove employees by their id
    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee : employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }//remove method end

    //method to display employees
    public void displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }//loop block
    }//displayEmployee end

}//end class PayrollSystem


