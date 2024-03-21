// all element are occuring 3 times except one, task is to return that element

import java.util.HashMap;
import java.util.Map;

public class ReturnSingleElement {

    public static int bruteForce(int[] arr) {
        // time complexity : O(n^2)
        // space : O(1)
        for(int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int counter = 0;
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }
                if(elem == arr[j]) {
                    counter++;
                }
            }

            if(counter == 0){
                return elem;
            }
        }
        return -1;
    }

    public static int better(int[] arr) {
        // time complexity : O(nlogn)
        // space : O(n)

        Map <Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int item : arr){
            if(map.containsKey(item)){
                map.put(item, map.get(item)+1);
            }
            else{
                map.put(item, 1);
            }
        }

        for(int item : map.keySet()){
            if(map.get(item) == 1){
                return item;
            }
        }
        return 0;
    }

    public static int optimal(int[] arr) {
        int n = arr.length;
        
        return -1;
    }


    public static void main(String args[]) {
        // int[] arr = {1,1,1,3,3,3,4,4,4,4,5,5,5};

        // System.out.println(bruteForce(arr));
        // System.out.println(better(arr))

        
    }
}
