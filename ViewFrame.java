package cs304.graphics;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.BorderLayout;

public class ViewFrame extends JFrame
{
   private DrawScreen drawScreen;
   private ButtonPanel buttonPanel;
   private Timer timer;

   public ViewFrame()
   {
      this.setSize(800, 840);
      this.setTitle( "Data Structures" );
      this.setLayout(new BorderLayout());
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      drawScreen = new DrawScreen();

      buttonPanel = new ButtonPanel();
      this.add(buttonPanel, BorderLayout.EAST);         
      this.add(drawScreen, BorderLayout.CENTER);
   }
}