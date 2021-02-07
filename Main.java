import java.awt.Rectangle;

/**
   This program demonstrates the use of a Measurer.
*/
public class Main
{
   public static void main(String[] args)
   {
      Measurer m = new RectangleMeasurer();

      DataSet data = new DataSet(m);

      data.add(new Rectangle(5, 10, 20, 30));
      data.add(new Rectangle(10, 20, 30, 40));
      data.add(new Rectangle(20, 30, 5, 15));
      data.add(new Rectangle(420, 690, 420, 666));
      data.add(new Rectangle(420, 690, 420, 69));

      System.out.println("Average perimeter: " + data.getAverage());

      Rectangle max = (Rectangle) data.getMaximum();
      System.out.println("Maximum perimeter rectangle: " + max);
      System.out.println("Expected: " 
         + "java.awt.Rectangle[x=10,y=20,width=30,height=40]");
   }
}
