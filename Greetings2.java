
import java.awt.*;
import javax.swing.*;

public class Greetings2 extends JPanel {
	
   private int myWindowWidth = 300;
   private int myWindowHeight = 400;
	
   public Greetings2() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }

   
   public void paintComponent (Graphics g) {
      this.newDrawRect(g, 67, 86, 143, 25);
   }

   public void newDrawLine(int x, int y, int x1, int y1, Graphics g){
      g.drawLine(x,y,x1,y1);
   }

   public void newDrawRect(Graphics g, int tlx, int tly, int width, int height){
      g.drawLine(tlx, tly, width, tly);
      g.drawLine(tlx, tly, tlx, height);
      g.drawLine(tlx, height, width, height);
      g.drawLine(width, tly, width, height);
   }

   
   
   // Step 25 Write newDrawRect2 here, which calls drawLine four times.
   
   // Step 26 This method takes top-left x, top-left y, bottom-right x, bottom-right y to define
   //  a rectangle.  It should take drawRect.
   public void newDrawRect2(Graphics g, int tlx, int tly, int brx, int bry) {
      
   }

   
}
