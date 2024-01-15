public class Bubblesort {
    public static void main(String args[]) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };

        for(int i = arr.length; i > -1; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(" |" + i + "| ");
        }
        System.out.println();
    }
}
