package EMPLOYEE_PAYROLL_SYSTEM;

import java.util.Scanner;

public class EmployeeMainMenuDriven {
public static PayrollSystem payrollSystem = new PayrollSystem();
    public static void addEmployee(){
        System.out.println("choose the option to add");
        System.out.println("F for full time employee");
        System.out.println("P for part time employee");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if(choice.toUpperCase().equals("F")){
            System.out.println("Enter employee details");
            sc.nextLine();
            System.out.println("Enter employee name");
            String name = sc.nextLine();
            System.out.println("Enter employee id");
            int id = sc.nextInt();
            System.out.println("Enter employee monthly salary");
            double monthlySalary = sc.nextDouble();

//            PayrollSystem payrollSystem = new PayrollSystem();
            FullTimeEmployee emp1 = new FullTimeEmployee(name,id ,monthlySalary);
            payrollSystem.addEmployee(emp1);
        } else if (choice.toUpperCase().equals("P")) {
            System.out.println("Enter employee details");
            sc.nextLine();
            System.out.println("Enter employee name");
            String name = sc.nextLine();
            System.out.println("Enter employee id");
            int id = sc.nextInt();
            System.out.println("Enter employee hourly work");
            int hourWork = sc.nextInt();
            System.out.println("Enter employee hourly rate");
            double hourRate = sc.nextDouble();

//            PayrollSystem payrollSystem = new PayrollSystem();
            PartTimeEmployee emp2 = new PartTimeEmployee(name,id,hourWork,hourRate);
            payrollSystem.addEmployee(emp2);

        }
        else System.out.println("Enter valid option");
    }
    public static void displayEmployee(){
//        PayrollSystem payrollSystem = new PayrollSystem();
        payrollSystem.displayEmployee();
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("Enter following choices");
            System.out.println("1. for add new employee");
            System.out.println("2. for display employees");
            System.out.println("3. for remove employee");
            System.out.println("0. for  stop & exit ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice == 0){
                System.out.println("stop successfully");
                break;
            }
            switch (choice){
                case 1 :
                    addEmployee();
                    System.out.println("employee added");
                    System.out.println();
                    break;
                case 2 :
                    System.out.println("displaying employee");
                    displayEmployee();
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("removing employee");
                    System.out.println("Enter emp id");
                    int id = sc.nextInt();
                    payrollSystem.removeEmployee(id);
                    System.out.println();
                    break;
                default:
                    System.out.println("Enter valid option");
                    System.out.println();
            }
        }//while loop block


    }//main method
}//class
