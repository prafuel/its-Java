public class NextPermutation {
    public static int[] rev(int[] arr, int low, int high) {
        while(low <= high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
        return arr;
    }
    public static void main(String args[]) {
        int[] arr = {4,3,2,1};

        int n = arr.length;
        int idx = -1;

        for(int i = n - 2; i > -1; i--) {
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            arr = rev(arr,0,n-1);
        }
        else{
            arr = rev(arr,idx,n-1);
        }


        for(int item : arr) {
            System.out.print("|" + item + "|");
        }
        System.out.println();
    }
}
