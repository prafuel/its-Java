
public class Sum {
    public int fun1(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            count += i;
        }
        System.out.println(count);
        return count;
    }
    public int fun2(int num) {
        int count = (num * (num + 1)) / 2;
        System.out.println(count);
        return count;
    }

    public static void main(String args[]) {
        Sum obj = new Sum();

        int n;
        n = 15;

        // obj.fun1(n);
        obj.fun2(n);
    }   
}
