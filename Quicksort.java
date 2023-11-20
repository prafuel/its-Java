
public class Quicksort {
    public static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = getPartitionIndex(arr, low, high);
            qs(arr, low, partitionIndex - 1);
            qs(arr, partitionIndex + 1, high);
        }
    }

    public static int getPartitionIndex(int[] arr, int low, int high) {

        int pivot = low;

        int left = low;
        int right = high;

        while (left < right) {
            // get value of left and right
            while (arr[pivot] > arr[left] && left <= high) {
                left++;
            }

            while (arr[pivot] < arr[right] && right >= low) {
                right--;
            }

            if (left < right) {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // swap pivot to their original position
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
        return right;
    }

    public static void main(String args[]) {
        int[] arr = { 6,5,4,3,2,1 };
        int low = 0;
        int high = arr.length - 1;

        qs(arr, low, high);
        for (int i : arr) {
            System.out.print(" |" + i + "| ");
        }
        System.out.println();
    }
}