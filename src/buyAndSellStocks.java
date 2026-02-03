public class buyAndSellStocks {
    public static void maxProfitEarned(int[] arr){
        int buyingPrice = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<buyingPrice){
                buyingPrice = arr[i];
            }else{
                int profit = arr[i]-buyingPrice;
                if(profit>max_profit){
                    max_profit=profit;
                }
            }
        }
        System.out.println(max_profit);
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.print("Max profit earned from array 1 is : ");
        maxProfitEarned(arr);
        System.out.println();
        int[] arr2 = {7,5,3,6,4,1};
        System.out.print("Max profit earned from array 2 is : ");
        maxProfitEarned(arr2);
    }


}
