
public class Two_sum {

    public static void better_twoSum(int nums[], int target) {
        
    }

    public static int[] bruteForce_twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i+1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    // System.out.println(i + " " + j);
                    int ans[] = {i,j};
                    return ans;
                }
            }
        }

        int non[] = {-1,-1};
        return non;
    }
    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;

        int[] ans = bruteForce_twoSum(arr, target);

        // System.out.println(ans);
        for(int i : ans){
            System.out.println(i);
        }
    }
}