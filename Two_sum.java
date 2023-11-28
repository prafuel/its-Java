
import java.util.HashMap;
import java.util.Map;

public class Two_sum {

    public static int[] better(int[] arr, int target) {
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }   


        for(int i = 0; i < n; i++) {
            int sub = target - arr[i];
            if(map.containsKey(sub) && map.get(sub) != i) {
                return new int[]{i,map.get(sub)};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] bruteForce_twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    // System.out.println(i + " " + j);
                    int ans[] = { i, j };
                    return ans;
                }
            }
        }

        int non[] = { -1, -1 };
        return non;
    }

    public static void main(String[] args) {
        int[] arr = { 4,8,9,3,1,2,4};
        int target = 8;

        // int[] ans = bruteForce_twoSum(arr, target);
        int[] ans = better(arr, target);
        // System.out.println(ans);
        for(int i : ans){
        System.out.println(i);
        }

    }
}