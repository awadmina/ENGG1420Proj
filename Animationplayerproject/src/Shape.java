
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author minaawad
 */
public class Shape {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File myObj = new File("shapes.txt");
            Scanner sc = new Scanner(myObj);

            //number of frames
            String numframes = sc.nextLine();
            System.out.println(numframes);
            String[] frames = numframes.split(" ");
            int f = Integer.parseInt(frames[1]);
            System.out.println(f);

            //while (sc.hasNextLine()) {
            //String data = myReader.nextLine();
            //frames per second
            String fps = sc.nextLine();
            System.out.println(fps);
            String[] framespersecond = fps.split(" ");
            int FPS = Integer.parseInt(framespersecond[1]);
            System.out.println(FPS);

            //System.out.println(data);
            // }
            sc.close();
        } catch (FileNotFoundException e) {
            //System.out.println("An error occurred.");
            //e.printStackTrace();
        }

    }
}

//animation timer 
