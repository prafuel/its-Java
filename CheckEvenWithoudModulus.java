public class CheckEvenWithoudModulus {

    public static boolean isEven(int n) {
        int check = n & 1;
        if(check == 1) {
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        int n = 41;
        System.out.println(isEven(n));
    }
}
