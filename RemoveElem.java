import java.util.ArrayList;

public class RemoveElem {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;
        // better
        // ArrayList<Integer> list = new ArrayList<Integer>();

        // for(int item : nums){
        //     if(item != val){
        //         list.add(item);
        //     }
        // }

        // for(int i = 0; i < nums.length; i++){
        //     if(i < list.size()){
        //         nums[i] = list.get(i);
        //     }
        //     else{
        //         nums[i] = val;
        //     }
        // }

        // System.out.println("Size of list " + list.size());

        // optimal
        

        for(int i = 0; i < nums.length; i++){
            System.out.println(" |" + nums[i] + "| ");
        }
    }
}