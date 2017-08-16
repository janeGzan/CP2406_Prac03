class FixDebugBox
{
   private int width;
   private int length;
   private int height;
   FixDebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   FixDebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   double showVolume()
   {
      return (double) (length * width * height);
   }
}
