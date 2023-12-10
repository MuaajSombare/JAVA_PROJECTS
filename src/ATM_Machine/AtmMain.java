package ATM_Machine;

import java.util.Scanner;

class ATM{
    float balance;
    int pin = 4565;

    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == pin) menu();
        else {
            System.err.println("Invalid pin");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1 for check balance");
        System.out.println("2 for withdraw money");
        System.out.println("3 for deposit money");
        System.out.println("4 for exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1) checkBalance();
        else if (choice == 2) withdrawBalance();
        else if (choice == 3) depositeMoney();
        else if (choice == 4) return;
        else System.out.println("Enter valid number");

    }

    public void checkBalance(){
        System.out.println("Balance = "+ balance);
        menu();
    }
    public void withdrawBalance(){
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance) System.out.println("insufficient balance");
        else {
            balance -= amount;
            System.out.println("amount withdraw successfully");
        }
        menu();
    }

    public void depositeMoney(){
        System.out.println("Enter amoutn to deposite");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("balane is "+ balance);
        menu();
    }
}
public class AtmMain {
    public static void main(String[] args) {
        ATM muaaj = new ATM();
        muaaj.checkPin();

    }
}
