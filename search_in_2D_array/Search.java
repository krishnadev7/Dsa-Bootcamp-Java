import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 343, 54 },
                { 43, 54, 23, 54 },
                { 23, 34 },
                { 43, 54, 65, 43, 54, 32, 43 }
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
