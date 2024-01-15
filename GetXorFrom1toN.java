
public class GetXorFrom1toN {
    public static int verify(int n){
        int xor = 0;
        for(int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        return xor;
    }

    public static int answerInConstantTC(int n){

        if(n % 4 == 0){
            return n;
        }

        if(n % 4 == 1){
            return 1;
        }

        if(n % 4 == 2){
            return n + 1;
        }

        if(n % 4 == 3){
            return 0;
        }

        return -1;
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println(answerInConstantTC(n));
    }
}
