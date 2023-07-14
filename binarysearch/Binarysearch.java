public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-12,-5,-2,0,1,23,55,64,65};
        int target = 64;
        int ans = Bsearch(arr,target);
        System.out.println(ans);
    }
    static int Bsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    } 
}
