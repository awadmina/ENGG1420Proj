
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
            //System.out.println(numframes);
            String[] frames = numframes.split(" ");
            int f = Integer.parseInt(frames[1]);
            System.out.println("Total frames: " + f);

            //while (sc.hasNextLine()) {
            //String data = myReader.nextLine();
            //frames per second
            String fps = sc.nextLine();
            //System.out.println(fps);
            String[] framespersecond = fps.split(" "); //splits string 
            int FPS = Integer.parseInt(framespersecond[1]); //converts String to number
            System.out.println("frames per second: " + FPS); //prints the number of fps

            String elements = sc.nextLine();
            int ELEMENTS = Integer.parseInt(elements);
            System.out.println("The number of elements: " + ELEMENTS);
            //String[] ELEMENT = elements.split(" ");
            //int FPS = Integer.parseInt(framespersecond[1]);
            //System.out.println(FPS);

            //in circle class
            String object = sc.nextLine();
            if (object.contains("Circle")) {        //circle
                //radius
                String radius = sc.nextLine();
                String[] RADIUS = radius.split(" ");
                int r = Integer.parseInt(RADIUS[1]);
                System.out.println("r: " + r);
                //x-axis
                String x_axis = sc.nextLine();
                String[] X_AXIS = x_axis.split(" ");
                int x = Integer.parseInt(X_AXIS[1]);
                System.out.println("x: " + x);
                //y-axis
                String y_axis = sc.nextLine();
                String[] Y_AXIS = y_axis.split(" ");
                int y = Integer.parseInt(Y_AXIS[1]);
                System.out.println("y: " + y);
                //read show and hide
                String show = sc.nextLine();
                
                if(show.contains("Show")){
                    String s = sc.nextLine();
                    String[] START = s.split(" ");
                    int startshow = Integer.parseInt(START[1]);
                    System.out.println("Start show: " + startshow);
                }
                String hide = sc.nextLine();
                if (hide.contains("Hide")){
                    String s2 = sc.nextLine();
                    String[] START2 = s2.split(" ");
                    int starthide = Integer.parseInt(START2[1]);
                    System.out.println("Start hide: " + starthide);
                }
                

            } else if (object.contains("Rect")) {

                if (object.contains("Show2")) {    //Show   //there is 2 shows not sure
                } else if (object.contains("Jump")) {
                }
                //add effect and show transfer here
            }

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
