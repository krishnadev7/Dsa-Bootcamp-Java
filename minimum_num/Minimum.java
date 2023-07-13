import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter limit of the array: ");
        int limit = in.nextInt();
        int[] arr = new int[limit];
        System.out.println("Enter elements to the array: ");
        for (int i = 0; i < limit; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
