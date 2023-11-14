import java.util.Scanner;

public class Inputs{
        public static void main(String[] args){
            System.out.println();
            System.out.print("Enter your Roll No.: ");
            Scanner input = new Scanner(System.in);
            int rollNo = input.nextInt();
            System.out.println("Your Roll No. is " + rollNo);
        }
    }