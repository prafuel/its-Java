public class BinarySearch {

    public static int usingIteration(int[] arr, int key) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] > key) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return -1;
    }

    public static int usingReccursion(int[] arr, int key, int left, int right) {
        int mid = left + (right - left) / 2;

        if(arr[mid] == key) {
            return mid;
        }
        else if(arr[mid] > key) {
            return usingReccursion(arr, key, left, mid - 1);
        }
        else{
            return usingReccursion(arr, key, mid + 1, right);
        }
    }

    public static void main(String args[]) {
        int[] arr = {0,1,2,9,14,55};
        int key = 2;

        // 1] Iterative
        System.out.println("index : " + usingIteration(arr,key));
        // 2] Reccursive
        System.out.println("index : " + usingReccursion(arr,key, 0, arr.length - 1));
    }
}