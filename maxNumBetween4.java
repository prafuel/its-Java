public class maxNumBetween4 {
    public static void main(String args[]) {
        int a = 10;
        int b = 34;

        int c = 220;
        int d = 90;

        int ans = 0;

        if (a + b > c + d) {
            if (a > b) {
                ans = a;
            } else {
                ans = b;
            }
        } else {
            if (c > d) {
                ans = c;
            } else {
                ans = d;
            }
        }

        System.out.println("Ans = " + ans);
    }
}
