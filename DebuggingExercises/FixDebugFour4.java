// This class discounts prices by 10%
public class FixDebugFour4
{
   private static double DISCOUNT_RATE = 0.90;
   public static void main(String args[])
   {
      double price = 100.00;
      double price2 = 100.00;
      tenPercentOff(price, DISCOUNT_RATE);
      tenPercentOff(price2, DISCOUNT_RATE);
   }
   public static void tenPercentOff(double p)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off "  + p);
      System.out.println("  New price is " + newPrice);
   }
   private static void tenPercentOff(double price, double p)
   {
      double newPrice = price * p;
      System.out.println("Ten percent off " + price);
      System.out.println("  New price is " + newPrice);
   }
}
