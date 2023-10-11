

public class Product {

    public int fact(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        else {
            return num * fact(num-1);
        }
    }

    public int fun1(int num) {
        int pro = 1;
        for(int i = 1; i <= num; i++) {
            pro *= i;
        }
        System.out.println(pro);
        return pro;
    }

    public int fun2(int num) {
        return fact(num);
    }
    public static void main(String[] args) {
        Product pr = new Product();

        int num;
        num = 15;
        
        pr.fun1(num);
        System.out.println(pr.fun2(num));
        // System.out.println(pr.fact(num));
    }
}