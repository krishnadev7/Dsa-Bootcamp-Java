public class Rbs {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return Bsearch(nums,target,0,nums.length - 1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return Bsearch(arr,target,0,pivot - 1);
        }else{
            return Bsearch(arr, target, pivot + 1, nums.length - 1);
        }
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start ) / 2;
            if(start < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return - 1;
    }

    static int Bsearch(int[] arr,int target, int start, int end){
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
