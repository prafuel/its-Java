public class SellAndBuy {

    public static int max(int x,int y){
        if(x > y) {
            return x;
        }
        return y;
    }

    public static int minimum(int min, int arr[], int n) {
        for(int i = 0; i < n; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {

        int[] stocks = {7,1,4,3,2,5,9};

        int profit = 0;
        int min = stocks[0];

        for(int i = 1; i < stocks.length; i++) {
            int prev = profit;

            int cost = stocks[i] - min;
            profit = max(prev,cost);
            min = minimum(min,stocks,i);

            // System.out.println("i = " + i + " prev = " + prev + " profit = " + profit + " min = " + min + " cost = " + cost + " stock[i] = " + stocks[i]);
        }

        System.out.println("Maximum Profit is : " + profit);
    }
}
