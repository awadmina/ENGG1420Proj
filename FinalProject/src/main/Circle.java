
import java.awt.Color;

/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 */
public class Circle extends Shape{
    
 int r; //we might need to make variables final to use animation timer
 int x;
 int y;
 int red;
 int blue;
 int green;

    Circle(int r, int x, int y, int red, int blue, int green) {
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

    
   
}
