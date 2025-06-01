class Check {
    //int[] stocks = {9, 8, 6, 4, 2, 1};
    int[] stocks = {1,2,3,4,5,6,7,8,9};

    public void Stock_check() {
        int buy = stocks[0];
        int maxProfit = 0;

        for (int i = 1; i < stocks.length; i++) {
            int sell = stocks[i];
            if (sell > buy) {
                int profit = sell - buy;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                buy = stocks[i];
            }
        }

        System.out.println("Maximum profit is: " + maxProfit);
    }
}

public class Array {
    public static void main(String[] args) {
        Check c = new Check();
        c.Stock_check();
    }
}

