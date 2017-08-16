public class Billing {

    private static final double TAX = 0.08;
    public static void main(String args[])
    {
        double priceOfItem = 10;
        int numberOfItems = 1;
        double couponValue = 1;

        double test1 = computeBill(priceOfItem);
        double test2 = computeBill(priceOfItem, numberOfItems);
        double test3 = computeBill(priceOfItem, numberOfItems, couponValue);

        System.out.println(String.format("%.2f %.2f %.2f",test1, test2,  test3));
    }
    private static double computeBill(double price)
    {
        return price + (price * TAX);
    }
    private static double computeBill(double price, int quantity)
    {
        return (price * quantity) + (price * TAX);
    }
    private static double computeBill(double price, int quantity, double coupon)
    {
        return ((price * quantity) - coupon) + (price * TAX);
    }

}
