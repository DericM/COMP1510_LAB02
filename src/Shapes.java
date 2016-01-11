/**

 * 
 */
import javax.swing.JApplet; 
import java.awt.*;
/**
 * @author Deric
 *
 */
public class Shapes extends JApplet{

    
    public Shapes(){
        getContentPane().setBackground(Color.black);
    }
    
    public void paint(Graphics page){
        super.paint(page);
        // Declare size constants 
        final int MAX_SIZE = 300; 
        final int PAGE_WIDTH = 500; 
        final int PAGE_HEIGHT = 350;
        // Declare variables 
        int x;
        int y;
        // x and y coordinates of upper left-corner of each shape 
        int width; 
        int height; // width and height of each shape
        
        // Set the background color 
        //setBackground(Color.yellow);        
        
        // Set the color for the next shape to be drawn 
        page.setColor (Color.blue);
        // Assign the corner point and width and height 
        x = 200; 
        y = 150;
        width = 200; 
        height = 150;
        page.fillRect(x, y, width, height); 
        
        page.setColor (Color.orange);
        // Assign the corner point and width and height 
        x = 280; 
        y = 170;
        width = 110; 
        height = 80;
        page.fillRect(x, y, width, height); 
        
        page.setColor (Color.green);
        // Assign the corner point and width and height 
        x = 20; 
        y = 15;
        width = 100; 
        height = 120;
        page.fillOval(x, y, width, height); 
        
        page.setColor (Color.red);
        // Assign the corner point and width and height 
        x = 180; 
        y = 140;
        width = 80; 
        height = 130;
        page.fillOval(x, y, width, height); 
    }

}
