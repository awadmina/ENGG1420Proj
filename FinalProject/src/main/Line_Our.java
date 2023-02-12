
import java.awt.Color;

/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 */
public class Line_Our extends Shape {
   int startX, startY, endX, endY, Border_Thickness, Red, Green, Blue ;
    Effect eff1;
 Effect eff2;

    //constructor for line

    public Line_Our(int startX, int startY, int endX, int endY, int Red, int Green, int Blue, int Border_Thickness) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.Border_Thickness = Border_Thickness;
        this.Red = Red;
        this.Green = Green;
        this.Blue = Blue;
    }

    
    
    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void setBorderthickness(double borderthickness) {
        this.borderthickness = borderthickness;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setEff1(Effect eff1) {
        this.eff1 = eff1;
    }

    public void setEff2(Effect eff2) {
        this.eff2 = eff2;
    }
    
    
    //colors are R, G, B 
    //don't know if it should be in String 
    
    Line_Our()
    {
        
    }
    
    public void Line()
    {
        
    }
}
