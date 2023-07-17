public class OrderAgnostic {
    public static void main(String[] args) {
        // int[] arr = {-12,-5,-2,0,1,23,55,64,65};
        int[] arr1 = {90,80,40,30,20,5,4,3,2,1};
        int target = 20;
        int ans = orderAgnostic(arr1,target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid  + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
