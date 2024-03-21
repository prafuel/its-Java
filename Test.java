
public class Test {
    public static void main(String args[]) {
        int[] arr = {2,3,-9,6,-1,-2};

        int sum = 0;
        int max = 0;
        // kadan's algo
        for(int i = 0; i < arr.length; i++) {
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
            sum = sum + arr[i];
        } 

        System.out.println("Max Subset sum : " + max);
    }
}