
class GetDoubleElement {
    public static void main(String args[]) {
        // Given 
        int[] arr = {1,3,4,2,2};
        int n = 4;

        int total_xor = 0;
        for(int i = 1; i <= n; i++) {
            total_xor = total_xor ^ i;
        }

        int arr_xor = 0;
        for(int i = 0; i < arr.length; i++) {
            arr_xor = arr_xor ^ arr[i];
        }
        
        int result = total_xor ^ arr_xor;
        System.out.println("twice element : " + result);
    }
}