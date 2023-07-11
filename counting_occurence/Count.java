import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number a number: ");
        int num = in.nextInt();
        System.out.println("Enter number to find occurence: ");
        int n = in.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == n) {
                count++;
            }
            num = num / 10;
        }

        System.out.println("number of Occurence: " + count);
    }
}
