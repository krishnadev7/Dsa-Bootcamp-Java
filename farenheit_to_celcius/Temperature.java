import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in farenheit");
        float tempFar = in.nextFloat();
        float tempCel = (tempFar-32) * 5/9;
        System.out.println("Temperature is: "+tempCel+" fahrenheit");
    }
}
