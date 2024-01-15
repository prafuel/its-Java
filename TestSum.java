import java.util.Map;
import java.util.HashMap;

public class TestSum {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }

        if(i+1 != n) {
            System.out.println(i + " False");
        }
        else{
            System.out.println("True");
        }
    }
}
