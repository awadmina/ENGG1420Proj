
import java.awt.Color;

/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 */
public class Circle_our extends Shape{
    
 int r; //we might need to make variables final to use animation timer
 int x;
 int y;
 int red;
 int blue;
 int green;
 Effect eff1;
 Effect eff2;

    Circle_our(int r, int x, int y, int red, int blue, int green) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    /*
    *@return x
    */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /*
    *@return y
    */
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*
    *@return red
    */
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }
    
    /*
    *@return blue
    */
    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    /*
    *@return green
    */
    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    
    
            //////* I don't think we need any of the below*///////
    /*
    public void setR(int r) {
        this.r = r;
    }

    public void setColour(int red, int green, int blue){
        this.colour = new Color(red, green, blue);
    }

    //I don't think we need this; just make it a black border
    public void setBorderColor(int r, int g, int b) {
        this.borderColor = new Color(r,g,b);
    }

    public void setBorderthickness(double borderthickness) {
        this.borderthickness = borderthickness;
    }
   
   
    
    public void Circle(){
        
        
    }
    */

    public void setEff1(Effect eff1) {
        this.eff1 = eff1;
    }

    public void setEff2(Effect eff2) {
        this.eff2 = eff2;
    }
}
