import ferrari.*;
import javax.swing.JFrame;

public class Main
{
   public static void main(String[] args)
   {
      System.out.println("Hello");
      
      JFrame frame = new JFrame("Ferrari");
      
      FerrariPanel f_panel = new FerrariPanel();
      
      
      
      frame.setSize(800,600);
      frame.add(f_panel);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      
   }

}
