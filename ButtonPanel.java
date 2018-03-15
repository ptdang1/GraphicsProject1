package cs304.graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;


public class ButtonPanel extends JPanel
{
   public ButtonPanel( ) 
   {
      this.setSize(100, 800);
      this.setBackground(Color.YELLOW);
      this.setVisible(true);
      this.setLayout(new GridLayout(12,1,20,20));
      
      JButton button = new JButton("About");
      this.add(button);
      button = new JButton("");
      this.add(button);
      button = new JButton("");
      this.add(button);
   }
}