package cs304.graphics;

import javax.swing.JPanel;   
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawScreen extends JPanel implements ActionListener
{
   ViewFrame vf;
   Graphics g;
   Shape2D  shape2D;
   Shape2D  myShape2D;
   Shape2D  myShape;
   Timer timer;
   
   public DrawScreen()
   {
      this.setSize(700, 800);
      this.setBackground(Color.BLUE); 
      this.setVisible(true);
      g = this.getGraphics();
      shape2D = new Circle();      
      myShape2D = new Circle();
      myShape = new Circle();
    
      timer = new Timer(20, this);   
      timer.start();   
   }
   public int count;
   public void actionPerformed( ActionEvent ae )
   {
      count++;
      System.out.println( "Count = " + count );
      repaint();
   }
   public void paint(Graphics g)
   {
      /* paint the background */
      super.paint(g);
      this.g = g;
      g.setColor(Color.RED);
      g.drawLine(0,this.getHeight()/2,this.getWidth(), this.getHeight()/2);
      g.drawLine(this.getWidth()/2,0, this.getWidth()/2, this.getHeight()); 
      /* move and draw the shape objects */     
      if( shape2D != null ) 
      {
         shape2D.move(this);
         shape2D.draw(this);
      }
      if( myShape2D != null ) 
      {
         myShape2D.move(this);
         myShape2D.draw(this);
      }
      if( myShape != null ) 
      {
         myShape.move(this);
         myShape.draw(this);
      }

   }
}