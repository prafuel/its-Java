

public class TwoToPowerX {

    public static long getTwoPowerX(int x){
        // most optimal way to do 
        // using bitwise operation, left shift, in O(1) time complexity
        long ans = 1 << x;
        return ans;
    }
    public static void main(String args[]) {
        // 2^x = ?

        int x = 10;
        System.out.println("2^" + x + " = " + getTwoPowerX(x));
    }  
}
