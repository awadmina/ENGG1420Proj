
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minaawad
 */
public class ChangeColor extends Effects{
    
    ChangeColor()
    {
        
    }
    
    public void ChangeColor() throws FileNotFoundException, IOException
            
    {
        
        String path="./shapes.txt";
        
        File file=new File(path);
        
        if(file.exists())
        {
         
            BufferedReader input=new BufferedReader(new FileReader(path));
            
            String val = null;
            while((val=input.readLine())!=null)
            {
                System.out.println("Val"+val);
            }
        
        }
    }
}
