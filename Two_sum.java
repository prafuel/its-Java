
import java.util.HashMap;
import java.util.Map;

public class Two_sum {

    public static int[] better(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        // Add element into hashmap
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        System.out.println(map);

        for(int i = 0; i < nums.length; i++) {
            int substraction = target - nums[i];
            System.out.println(map.get(substraction));
            if(map.containsKey(substraction) && map.get(substraction) != i) {
                System.out.println(i + " " + map.get(substraction));
                return new int[]{i,map.get(substraction)};
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

        // // System.out.println(ans);
        // for(int i : ans){
        // System.out.println(i);
        // }

        better(arr, target);
    }
}