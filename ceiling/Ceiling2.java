public class Ceiling2 {
    public static void main(String[] args) {
        int[] arr = {25,27,28,30,32,36,48};
        int target = 37;
        System.out.println(ceil(arr, target));
    }
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
