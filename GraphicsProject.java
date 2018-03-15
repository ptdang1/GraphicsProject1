package cs304.graphics;

public class GraphicsProject
{  
   private ViewFrame   viewFrame;
   
   public GraphicsProject()
   {
      viewFrame = new ViewFrame();
      viewFrame.setVisible(true);
   }
   public static void main(String[] args)
   {
      GraphicsProject gp = new GraphicsProject();
      System.out.println("Here we go!" );
   }
}