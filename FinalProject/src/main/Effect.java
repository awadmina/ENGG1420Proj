/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 */
public class Effect {
String type;
int start;
int xJump;
int yJump;
    public Effect(String type, int start) {
        this.type = type;
        this.start = start;
        this.xJump=0;
        this.yJump=0;
                
    }

    public Effect(String type, int start, int xJump, int yJump) {
        this.type = type;
        this.start = start;
        this.xJump = xJump;
        this.yJump = yJump;
    }

    /*
    *@return type
    */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*
    *@return start
    */
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getxJump() {
        return xJump;
    }

    public void setxJump(int xJump) {
        this.xJump = xJump;
    }

    public int getyJump() {
        return yJump;
    }

    public void setyJump(int yJump) {
        this.yJump = yJump;
    }

   
}
