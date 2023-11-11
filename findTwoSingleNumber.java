
public class findTwoSingleNumber {
    public static int[] solution(int[] arr) {

        int xor = 0;
        for (int item : arr) {
            xor = xor ^ item;
        }

        int i = 0;
        int num = xor;
        int check = (num >> i) & 1;

        while (check == 0) {
            i++;
            check = (num >> i) & 1;
        }

        int mask = 1 << i;

        int xor1 = 0; 
        int xor2 = 0;

        for(int item : arr) {
            int value = item & mask;
            if(value == 0) {
                xor1 = xor1 ^ item;
            }
            else{
                xor2 = xor2 ^ item;
            }
        }

        System.out.println("xor1 = " + xor1 + " xor2 = " + xor2);

        // System.out.println("i = " + i + " xor = " + xor + " mask = " + mask);

        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        int[] arr = { 2, 2, 3, 4, 4, 5, 6, 6 , 3 , 7};

        int[] ans = new int[10];

        ans = solution(arr);

    }
}
