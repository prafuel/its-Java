
public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0, -1 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int mini_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    mini_idx = j;
                }
                // Swapping without 3rd var
                arr[i] = arr[i] ^ arr[mini_idx];
                arr[mini_idx] = arr[i] ^ arr[mini_idx];
                arr[i] = arr[i] ^ arr[mini_idx];
            }
        }

        for (int i : arr) {
            System.out.print(" |" + i + "| ");
        }
        System.out.println();
    }
}
