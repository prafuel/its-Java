import java.util.ArrayList;
import java.util.List;

public class RemoveZero {
    public static int[] bruteForce(int[] arr) {
        int n = arr.length;

        List<Integer> list = new ArrayList<Integer>();
        for (int item : arr) {
            if (item != 0) {
                list.add(item);
            }
        }

        int i = 0;
        for (int item : list) {
            arr[i] = item;
            i++;
        }

        while (i < n) {
            arr[i] = 0;
            i++;
        }

        return arr;

    }

    public static int[] optimal(int[] arr) {
        int n = arr.length;

        int left = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                left = i;
                break;
            }
        }

        int right = n - 1;

        if (left != -1) {
            while (left <= right) {
                if (arr[left] != 0) {
                    left++;
                }

                if (arr[right] == 0) {
                    right--;
                }

                if (arr[right] != 0 && arr[left] == 0) {
                    int temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                }
            }
        } else {
            System.out.println("Not a single ZERO found");
            return arr;
        }
        
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;

        System.out.println("left : " + left + " " + "right : " + right);
        return arr;
    }

    public static void main(String args[]) {
        // int[] arr = { 1, 4, 5, 0, 0, 5, 60, 0, 4, 5, 0 , 0 ,1};
        int[] arr = { 0, 0, 0, 0, 0, 0, 3, 4, 5, 6, 5, 0, 0, 4, 5, 6, 7, 0, 0, 0, 9 };

        // arr = bruteForce(arr);

        arr = optimal(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "| ");
        }

        System.out.println();

    }
}
