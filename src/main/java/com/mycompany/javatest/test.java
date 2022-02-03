/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatest;

/**
 *
 * @author minaawad
 */
public class test {
    
    public static void main(String[] args)
    {
        class Circle
        {
            int r;
            int x, y;
        
            double circumference()
            {
                return 2 * r * 3.14;
            }
        
            double area()
            {
                return r * r * 3.14;
            }
        }
        
        //does this work?
        //this works
        Circle c1 = new Circle();
        
        c1.r = 10;
        c1.x = 5;
        c1.y = 5;
        
        double area = c1.area();
        //double circumference = c2.circumference();
        
        System.out.println("Area: Volume" + area + " This is ther area");   
    }
}
