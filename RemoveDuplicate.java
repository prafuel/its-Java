import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;


public class RemoveDuplicate {
    public static void better(int nums[]) {
        Set<Integer> set = new HashSet<Integer>();

        for(int item : nums) {
            set.add(item);
        }

        int i = 0;
        for(int item : set){
            nums[i++] = item;
        }

        while(i < nums.length) {
            nums[i] = Integer.MAX_VALUE;
            i++;
        }
        Arrays.sort(nums);

        for(int it : nums) {
            System.out.print(" |" + it + "| ");
        }

        System.out.println(set.size());
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        better(arr);
    }
}
