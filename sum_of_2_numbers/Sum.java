import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first No.: ");
        int num1 = input.nextInt();
        System.out.println("Enter your Second No.:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);
    }
}
