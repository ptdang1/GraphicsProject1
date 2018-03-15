package cs304.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.Shape;

public class Wheel extends Shape2D
{
   public Wheel(double x, double y, Shape2D parent)
   {
      super(x, y);
      this.parent = parent;
      this.width = ((Car)parent).width/4;
      this.length = ((Car)parent).length/3;
      this.color = Color.BLACK;
   }
   double yRot;
   Shape2D  parent;
   double width, length;
   Color color;
   public void move(DrawScreen ds)
   {
   
   }
   public void draw(DrawScreen ds)
   {
      Graphics2D g2D = (Graphics2D) ds.g;
      g2D.setColor(this.color);
      Rectangle2D rect = new Rectangle2D.Double(0,0, width, length);
      AffineTransform transform = new AffineTransform();
      
      
      double x = this.parent.getX() + this.getX();
      double y = this.parent.getY() + this.getY();
      
      transform.translate(ds.getWidth()/2.0-this.width/2.0 + x,
         ds.getHeight()/2.0-this.length/2.0 + y );
      transform.rotate(Math.toRadians(yRot), rect.getX() + rect.getWidth()/2, rect.getY() + rect.getHeight()/2);
      Shape transformed = transform.createTransformedShape(rect);
      g2D.fill(transformed);
   }
}
