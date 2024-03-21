import java.util.ArrayList;

/* 
 * 
 * if input = 1;
 * output must be : [0, 1, 1, 2, 1]
 * 
 * explanantion : 0000 -> 0 set bit
 *                0001 -> 1 set bit
 *                0010 -> 1 set bit
 *                0011 -> 2 set bit
 *                1000 -> 1 set bit
 */

public class NumberOfBits {
    public static void main(String args[]) {
        int n = 4;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i = 0; i <= n; i++){
            int count = 0;
            int current = i;
            while(current != 0){
                if((current & 1) == 1){
                    count++;
                }
                current = current >> 1;
            }

            ans.add(count);
        }
        System.out.println(ans);

    }
}
