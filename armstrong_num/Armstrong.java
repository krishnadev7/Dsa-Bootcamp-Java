import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find armstrong or not: ");
        int num = in.nextInt();
        boolean ans = armstrong(num);
        if (ans == true) {
            System.out.println(num + " " + "is a Armstrong Number!!!");
        } else {
            System.out.println(num + " " + "is a not an Armstrong Number!!!");
        }
        System.out.println(" ");
    }
    static boolean armstrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }
}
