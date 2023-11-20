public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while(j > -1 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }

        for (int i : arr) {
            System.out.print(" |" + i + "| ");
        }
        System.out.println();
    }
}
