

public class Prime {
    public static String isPrime(int num) {
        for(int i = 2; i <= num / i; i++ ) {
            if(num % i == 0) {
                return("Not A Prime!!");
            }
        }

        return("Prime Number");
    }
    public static void main(String args[]) {
        int num;
        num = 17;
        String ans = isPrime(num);
        System.out.println(ans);
    }
}
