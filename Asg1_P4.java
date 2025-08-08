import java.util.Scanner;

public class Asg1_P4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int a = sc.nextInt();

        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        String ope = sc.next();

        if (ope.equals("+")) {
            System.out.println("Addition of two numbers is: " + (a + b));
        } else if (ope.equals("-")) {
            System.out.println("Subtraction of two numbers is: " + (a - b));
        } else if (ope.equals("*")) {
            System.out.println("Multiplication of two numbers is: " + (a * b));
        } else if (ope.equals("/")) {
            if (b != 0) {
                System.out.println("Division of two numbers is: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Please enter a valid operator.");
        }

        sc.close();
    }
}
