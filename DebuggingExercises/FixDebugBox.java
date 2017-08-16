class FixDebugBox
{
   private int width;
   private int length;
   private int height;
   private void DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public void DebugBox(int width, int length, int height)
   {
      width = width;
      length = length;
      height = height;
   }
    void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   double showVolume()
   {
      return (double) (length - width - height);
   }
}
