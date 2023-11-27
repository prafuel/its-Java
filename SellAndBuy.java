public class SellAndBuy {

    public static int max(int x,int y){
        if(x > y) {
            return x;
        }
        return y;
    }

    public static int mini(int x, int y) {
        if(x > y) {
            return y;
        }
        return x;
    }

    public static void main(String args[]) {

        int[] stocks = {7,1,4,3,2,5,9};

        int profit = 0;
        int min = stocks[0];

        for(int i = 1; i < stocks.length; i++) {
            profit = max(profit, stocks[i] - min);
            min = mini(min, stocks[i]);
            // System.out.println("i = " + i + " profit = " + profit + " min = " + min + " stock[i] = " + stocks[i]);
        }

        System.out.println("Maximum Profit is : " + profit);
    }
}
