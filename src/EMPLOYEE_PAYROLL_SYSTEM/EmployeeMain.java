package EMPLOYEE_PAYROLL_SYSTEM;

public class EmployeeMain {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        //creating employees
        FullTimeEmployee emp1 = new FullTimeEmployee("Vikas",1,70000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Alexander",2,40,300.0);

        //adding employee
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        //displaying employees
        System.out.println("Initial employee details");
        payrollSystem.displayEmployee();

        //removing employee & displaying remainings
        payrollSystem.removeEmployee(2);
        System.out.println("remaining employee details");
        payrollSystem.displayEmployee();
    }
}
