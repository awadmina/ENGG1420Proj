

import java.awt.Color;
/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 */
public class Rectangle_our extends Shape{
    
    int length;
    int width;
    int x;
    int y;
     Effect eff1;
 Effect eff2;
    public Rectangle_our(int length, int width, int x, int y, int border) {
        setLength(length);
        setWidth(width);
        setX(x);
        setY(y);
        setBorderthickness(border);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
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
    
    public Rectangle_our()
    {
        
    }
    public void Rectangle()
    {
        
    }

    public void setEff1(Effect eff1) {
        this.eff1 = eff1;
    }

    public void setEff2(Effect eff2) {
        this.eff2 = eff2;
    }
    
}
