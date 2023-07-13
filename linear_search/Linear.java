import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter limit of array: ");
        int limit = in.nextInt();
        System.out.println("Enter"+" "+limit+" "+"elements to the array: ");
        for(int i=0; i<limit; i++){
            arr[i] = in.nextInt();
        }
       System.out.println("Enter the target number to find position: ");
       int target = in.nextInt();
       int pos = search(arr,target);
       if(pos == -1){
        System.out.println("target number not found on array!");
       }else{
        System.out.println("Found at positon"+" "+(pos+1));
       }
       System.out.print(" ");
    }
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
