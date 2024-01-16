import java.util.Scanner;

public class LbSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details");
        System.out.println("Enter employee id");
        int id = sc.nextInt();
        System.out.println("Enter employee hourly work");
        int hourWork = sc.nextInt();
        System.out.println("Enter employee hourly rate");
        double hourRate = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter employee name");
        String name = sc.nextLine();
    }
}
