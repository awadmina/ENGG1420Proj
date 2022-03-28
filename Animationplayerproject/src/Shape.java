
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minaawad
 */
public class Shape {
    
   
    
    public static void main(String... args) throws FileNotFoundException
    {
        String path="./shapes.txt";
        
        File file=new File(path);
        
        if(file.exists())
        {
         
            BufferedReader input=new BufferedReader(new FileReader(path));
            
            String val = null;
            try {
                while((val=input.readLine())!=null)
                {
                    System.out.println("Val"+val);
                }
            } catch (IOException ex) {
                Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

    }
}
