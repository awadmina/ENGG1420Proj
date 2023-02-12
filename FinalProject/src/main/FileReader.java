import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 * @since 2022-03-27
 */
public class FileReader {
     int f;
     int FPS;
     int ELEMENTS;
     int r;
     int x;
     int y;
     int red;
     int blue;
     int green;
     int length;
     int width;
     int startX;
     int startY;
     int end_X;
     int border;
     int Border_Thickness;
     int end_y;
     int startjump;
     int xjump;
     int yjump;
     int startshow;
     int starthide;
     int startchange;
     int lcnt=0;
     int ccnt=0;
     int rcnt=0;
    ArrayList<Circle_our> circle = new ArrayList();
        ArrayList<Rectangle_our> rectangle = new ArrayList();
        ArrayList<Line_Our> line = new ArrayList();
        // Everything before was initialized inside the file so it could not be accessed outside of it thats why I did this//

    public void loadAnimationFromFile(String a) {

    } 

    public void readfile(String fileName)  
           {
        try {
            File myObj = new File(fileName);
            Scanner sc = new Scanner(myObj);

            //number of frames
            String numframes = sc.nextLine();
            //System.out.println(numframes);
            String[] frames = numframes.split(" ");
             f = Integer.parseInt(frames[1]);
            System.out.println("Total frames: " + f);

            String fps = sc.nextLine();
            String FPS1 = fps.replaceAll("[^0-9]", " ");
            String[] framespersecond = FPS1.split("\\s+"); //splits string 
             FPS = Integer.parseInt(framespersecond[1]); //converts String to number
            System.out.println("frames per second: " + FPS); //prints the number of fps
            

             String elements = sc.nextLine();
             ELEMENTS = Integer.parseInt(elements);
            System.out.println("The number of elements: " + ELEMENTS);

            String empty = sc.nextLine();
            if (empty.contains("")) {

                int count = 0;
                while (count != ELEMENTS) {

                    //in circle class
                    String object = sc.nextLine();
                    if (object.contains("Circle")) //circle
                    {
                        System.out.println("Circle");
                        //radius
                        String radius = sc.nextLine();
                        String[] RADIUS = radius.split("\\s");
                         r = Integer.parseInt(RADIUS[1]);  //radius
                        System.out.println("r: " + r);
                        //x-axis
                        String x_axis = sc.nextLine();
                        String[] X_AXIS = x_axis.split("\\s");
                         x = Integer.parseInt(X_AXIS[1]); //x-axis
                        System.out.println("x: " + x);
                        //y-axis
                        String y_axis = sc.nextLine();
                        String[] Y_AXIS = y_axis.split("\\s");
                         y = Integer.parseInt(Y_AXIS[1]); //y-axis
                        System.out.println("y: " + y);
                        //reads colors
                        String c = sc.nextLine();           //colors red, green, blue
                        String COLOR1 = c.replaceAll("[^0-9]", " ");
                        String[] COLOR2 = COLOR1.split("\\s+");
                         red = Integer.parseInt(COLOR2[1]);
                         green = Integer.parseInt(COLOR2[2]);
                         blue = Integer.parseInt(COLOR2[3]);
                        System.out.println("Color: " + red + " " + green + " " + blue);
                        circle.add(new Circle_our(r, x, y, red, blue, green));
                        ccnt++;
                        
                        //read show and hide
                        for(int i=1;i<3;i++){
                   String nxtLine=sc.nextLine();
         if(nxtLine.contains("effect")){
                        String name = sc.nextLine();  //reads show
                        if(name.contains("Show")){
                            String s = sc.nextLine();
                            String[] START = s.split(" ");
                            startshow = Integer.parseInt(START[1]); //start of circle show
                            System.out.println("Start show: " + startshow);
                            if(i==1)
                            circle.get(ccnt-1).setEff1(new Effect("Show",startshow));
                            else if(i==2)
                            circle.get(ccnt-1).setEff2(new Effect("Show",startshow));    

                        }
                        else if(name.contains("Hide")){
                            String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            starthide = Integer.parseInt(START2[1]); //start of circle hide
                            System.out.println("Start hide: " + starthide);
                            if(i==1)
                            circle.get(ccnt-1).setEff1(new Effect("Hide",starthide));
                            else if(i==2)
                            circle.get(ccnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        else if(name.contains("Jump")){
                        String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            startjump = Integer.parseInt(START2[1]);
                            System.out.println("Start jump: " + startjump);//start of jump of rect
                            //x-axis
                            String x_ = sc.nextLine();
                            String[] X_ = x_.split("\\s");
                            xjump = Integer.parseInt(X_[1]);     //x-axis for jump rect
                            System.out.println("x: " + xjump);
                            //y-axis
                            String y_ = sc.nextLine();
                            String[] Y_ = y_.split("\\s");
                            yjump = Integer.parseInt(Y_[1]);     //y-axis for jump rect
                            System.out.println("y: " + yjump);
                            if(i==1)
                            circle.get(ccnt-1).setEff1(new Effect("Jump",startjump,xjump,yjump));
                            else if(i==2)
                            circle.get(ccnt-1).setEff2(new Effect("Jump",startjump,xjump,yjump));
                        }
                        else if(name.contains("Change")){
                        String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        startchange = Integer.parseInt(START2[1]); //start of circle hide
                        System.out.println("Start hide: " + startchange);
                        if(i==1)
                        circle.get(ccnt-1).setEff1(new Effect("Hide",starthide));
                        else if(i==2)
                        circle.get(ccnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        }
         else if(nxtLine.contains("Show")){
             String s = sc.nextLine();
                            String[] START = s.split(" ");
                            startshow = Integer.parseInt(START[1]); //start of circle show
                            System.out.println("Start show: " + startshow);
                            if(i==1)
                            circle.get(ccnt-1).setEff1(new Effect("Show",startshow));
                            else if(i==2)
                            circle.get(ccnt-1).setEff2(new Effect("Show",startshow));
         }
         else if(nxtLine.contains("Hide")){
                                         String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            starthide = Integer.parseInt(START2[1]); //start of circle hide
                            System.out.println("Start hide: " + starthide);
                            if(i==1)
                            circle.get(ccnt-1).setEff1(new Effect("Hide",starthide));
                            else if(i==2)
                            circle.get(ccnt-1).setEff2(new Effect("Hide",starthide));
         }
         else if(nxtLine.contains("Jump")){
             String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            startjump = Integer.parseInt(START2[1]);
                            System.out.println("Start jump: " + startjump);//start of jump of rect
                            //x-axis
                            String x_ = sc.nextLine();
                            String[] X_ = x_.split("\\s");
                            xjump = Integer.parseInt(X_[1]);     //x-axis for jump rect
                            System.out.println("x: " + xjump);
                            //y-axis
                            String y_ = sc.nextLine();
                            String[] Y_ = y_.split("\\s");
                            yjump = Integer.parseInt(Y_[1]);     //y-axis for jump rect
                            System.out.println("y: " + yjump);
                            if(i==1)
                            circle.get(ccnt-1).setEff1(new Effect("Jump",startjump,xjump,yjump));
                            else if(i==2)
                            circle.get(ccnt-1).setEff2(new Effect("Jump",startjump,xjump,yjump));
         }
                        else if(nxtLine.contains("Change")){
                            String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        startchange = Integer.parseInt(START2[1]); //start of circle hide
                        System.out.println("Start hide: " + startchange);
                        if(i==1)
                        circle.get(ccnt-1).setEff1(new Effect("Hide",starthide));
                        else if(i==2)
                        circle.get(ccnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        }
                    } else if (object.contains("Rect")) {
                        System.out.println("Rectangle");
                        //length
                        String l = sc.nextLine();
                        String[] LENGTH = l.split("\\s");
                         length = Integer.parseInt(LENGTH[1]); //length of rect
                        System.out.println("Length: " + length);
                        //width
                        String w = sc.nextLine();
                        String[] WIDTH = w.split("\\s");
                         width = Integer.parseInt(WIDTH[1]);  //width of rect
                        System.out.println("Width: " + width);
                        //x-axis
                        String x_axis = sc.nextLine();
                        String[] X_AXIS = x_axis.split("\\s");
                         x = Integer.parseInt(X_AXIS[1]);     //x-axis of rect
                        System.out.println("x: " + x);
                        //y-axis
                        String y_axis = sc.nextLine();
                        String[] Y_AXIS = y_axis.split("\\s");
                        y = Integer.parseInt(Y_AXIS[1]);     //y-axis of rect
                        System.out.println("y: " + y);
                        //border
                        String b = sc.nextLine();
                        String[] BORDER = b.split("\\s");
                        border = Integer.parseInt(BORDER[1]);//border of rect
                        System.out.println("border: " + border);
                        rectangle.add(new Rectangle_our(length, width, x, y, border));
                        rcnt++;
                      
                        for(int i=1;i<=2;i++){
                   String nxtLine=sc.nextLine();
         if(nxtLine.contains("effect")){
                        String name = sc.nextLine();  //reads show
                        if(name.contains("Show")){
                            String s = sc.nextLine();
                            String[] START = s.split(" ");
                            startshow = Integer.parseInt(START[1]); //start of circle show
                            System.out.println("Start show: " + startshow);
                            if(i==1)
                            rectangle.get(rcnt-1).setEff1(new Effect("Show",startshow));
                            else if(i==2)
                            rectangle.get(rcnt-1).setEff2(new Effect("Show",startshow));    

                        }
                        else if(name.contains("Hide")){
                            String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            starthide = Integer.parseInt(START2[1]); //start of circle hide
                            System.out.println("Start hide: " + starthide);
                            if(i==1)
                            rectangle.get(rcnt-1).setEff1(new Effect("Hide",starthide));
                            else if(i==2)
                            rectangle.get(rcnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        else if(name.contains("Jump")){
                        String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            startjump = Integer.parseInt(START2[1]);
                            System.out.println("Start jump: " + startjump);//start of jump of rect
                            //x-axis
                            String x_ = sc.nextLine();
                            String[] X_ = x_.split("\\s");
                            xjump = Integer.parseInt(X_[1]);     //x-axis for jump rect
                            System.out.println("x: " + xjump);
                            //y-axis
                            String y_ = sc.nextLine();
                            String[] Y_ = y_.split("\\s");
                            yjump = Integer.parseInt(Y_[1]);     //y-axis for jump rect
                            System.out.println("y: " + yjump);
                            if(i==1)
                            rectangle.get(rcnt-1).setEff1(new Effect("Jump",startjump,xjump,yjump));
                            else if(i==2)
                            rectangle.get(rcnt-1).setEff2(new Effect("Jump",startjump,xjump,yjump));
                        }
                        else if(name.contains("Change")){
                        String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        startchange = Integer.parseInt(START2[1]); //start of circle hide
                        System.out.println("Start hide: " + startchange);
                        if(i==1)
                        rectangle.get(rcnt-1).setEff1(new Effect("Hide",starthide));
                        else if(i==2)
                        rectangle.get(rcnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        }
         else if(nxtLine.contains("Show")){
             String s = sc.nextLine();
                            String[] START = s.split(" ");
                            startshow = Integer.parseInt(START[1]); //start of circle show
                            System.out.println("Start show: " + startshow);
                            if(i==1)
                            rectangle.get(rcnt-1).setEff1(new Effect("Show",startshow));
                            else if(i==2)
                            rectangle.get(rcnt-1).setEff2(new Effect("Show",startshow));
         }
         else if(nxtLine.contains("Hide")){
                                         String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            starthide = Integer.parseInt(START2[1]); //start of circle hide
                            System.out.println("Start hide: " + starthide);
                            if(i==1)
                            rectangle.get(rcnt-1).setEff1(new Effect("Hide",starthide));
                            else if(i==2)
                            rectangle.get(rcnt-1).setEff2(new Effect("Hide",starthide));
         }
         else if(nxtLine.contains("Jump")){
             String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            startjump = Integer.parseInt(START2[1]);
                            System.out.println("Start jump: " + startjump);//start of jump of rect
                            //x-axis
                            String x_ = sc.nextLine();
                            String[] X_ = x_.split("\\s");
                            xjump = Integer.parseInt(X_[1]);     //x-axis for jump rect
                            System.out.println("x: " + xjump);
                            //y-axis
                            String y_ = sc.nextLine();
                            String[] Y_ = y_.split("\\s");
                            yjump = Integer.parseInt(Y_[1]);     //y-axis for jump rect
                            System.out.println("y: " + yjump);
                            if(i==1)
                            rectangle.get(rcnt-1).setEff1(new Effect("Jump",startjump,xjump,yjump));
                            else if(i==2)
                            rectangle.get(rcnt-1).setEff2(new Effect("Jump",startjump,xjump,yjump));
         }
                        else if(nxtLine.contains("Change")){
                            String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        startchange = Integer.parseInt(START2[1]); //start of circle hide
                        System.out.println("Start hide: " + startchange);
                        if(i==1)
                        rectangle.get(rcnt-1).setEff1(new Effect("Hide",starthide));
                        else if(i==2)
                        rectangle.get(rcnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        }
                        //Rectangle arraylist


                    } else if (object.contains("Line")) { //Each line has a starting point (including startX and startY) and an end point (including endX and endY), color, and border thickness (border).
                        System.out.println("Line:");
                        //starting x
                        String readstartx = sc.nextLine();
                        String[] readstartxsplit = readstartx.split(" ");
                        startX = Integer.parseInt(readstartxsplit[1]);
                        System.out.println("StartX: " + startX);
                        //starting y
                        String readstarty = sc.nextLine();
                        String[] readstartysplit = readstarty.split(" ");
                        startY = Integer.parseInt(readstartysplit[1]);
                        System.out.println("startY: " + startY);
                        //ending x
                        String read_end_x = sc.nextLine();
                        String[] read_end_x_split = read_end_x.split(" ");
                         end_X = Integer.parseInt(read_end_x_split[1]);
                        System.out.println("end X: " + end_X);
                        //ending y
                        String read_end_y = sc.nextLine();
                        String[] read_end_y_split = read_end_y.split(" ");
                        end_y = Integer.parseInt(read_end_y_split[1]);
                        System.out.println("end y: " + end_y);
                        //colour
                        String c = sc.nextLine();           //colors red, green, blue
                        String COLOR1 = c.replaceAll("[^0-9]", " ");
                        String[] COLOR2 = COLOR1.split("\\s+");
                        red = Integer.parseInt(COLOR2[1]);
                        green = Integer.parseInt(COLOR2[2]);
                        blue = Integer.parseInt(COLOR2[3]);
                        System.out.println("Color: " + red + " " + green + " " + blue);

                        //ArrayList for Line, everytime there is a new line element it will add it to the arraylist
                        line.add(new Line_Our(startX, startY, end_X, end_y, red, green, blue, Border_Thickness));
                        lcnt++;
//Effects part:
                        for(int i=1;i<=2;i++){
                   String nxtLine=sc.nextLine();
         if(nxtLine.contains("effect")){
                        String name = sc.nextLine();  //reads show
                        if(name.contains("Show")){
                            String s = sc.nextLine();
                            String[] START = s.split(" ");
                            startshow = Integer.parseInt(START[1]); //start of circle show
                            System.out.println("Start show: " + startshow);
                            if(i==1)
                            line.get(lcnt-1).setEff1(new Effect("Show",startshow));
                            else if(i==2)
                            line.get(lcnt-1).setEff2(new Effect("Show",startshow));    

                        }
                        else if(name.contains("Hide")){
                            String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            starthide = Integer.parseInt(START2[1]); //start of circle hide
                            System.out.println("Start hide: " + starthide);
                            if(i==1)
                            line.get(lcnt-1).setEff1(new Effect("Hide",starthide));
                            else if(i==2)
                            line.get(lcnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        else if(name.contains("Jump")){
                        String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            startjump = Integer.parseInt(START2[1]);
                            System.out.println("Start jump: " + startjump);//start of jump of rect
                            //x-axis
                            String x_ = sc.nextLine();
                            String[] X_ = x_.split("\\s");
                            xjump = Integer.parseInt(X_[1]);     //x-axis for jump rect
                            System.out.println("x: " + xjump);
                            //y-axis
                            String y_ = sc.nextLine();
                            String[] Y_ = y_.split("\\s");
                            yjump = Integer.parseInt(Y_[1]);     //y-axis for jump rect
                            System.out.println("y: " + yjump);
                            if(i==1)
                            line.get(lcnt-1).setEff1(new Effect("Jump",startjump,xjump,yjump));
                            else if(i==2)
                            line.get(lcnt-1).setEff2(new Effect("Jump",startjump,xjump,yjump));
                        }
                        else if(name.contains("Change")){
                        String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        startchange = Integer.parseInt(START2[1]); //start of circle hide
                        System.out.println("Start hide: " + startchange);
                        if(i==1)
                        line.get(lcnt-1).setEff1(new Effect("Hide",starthide));
                        else if(i==2)
                        line.get(lcnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        }
         else if(nxtLine.contains("Show")){
             String s = sc.nextLine();
                            String[] START = s.split(" ");
                            startshow = Integer.parseInt(START[1]); //start of circle show
                            System.out.println("Start show: " + startshow);
                            if(i==1)
                            line.get(lcnt-1).setEff1(new Effect("Show",startshow));
                            else if(i==2)
                            line.get(lcnt-1).setEff2(new Effect("Show",startshow));
         }
         else if(nxtLine.contains("Hide")){
                                         String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            starthide = Integer.parseInt(START2[1]); //start of circle hide
                            System.out.println("Start hide: " + starthide);
                            if(i==1)
                            line.get(lcnt-1).setEff1(new Effect("Hide",starthide));
                            else if(i==2)
                            line.get(lcnt-1).setEff2(new Effect("Hide",starthide));
         }
         else if(nxtLine.contains("Jump")){
             String s2 = sc.nextLine();
                            String[] START2 = s2.split(" ");
                            startjump = Integer.parseInt(START2[1]);
                            System.out.println("Start jump: " + startjump);//start of jump of rect
                            //x-axis
                            String x_ = sc.nextLine();
                            String[] X_ = x_.split("\\s");
                            xjump = Integer.parseInt(X_[1]);     //x-axis for jump rect
                            System.out.println("x: " + xjump);
                            //y-axis
                            String y_ = sc.nextLine();
                            String[] Y_ = y_.split("\\s");
                            yjump = Integer.parseInt(Y_[1]);     //y-axis for jump rect
                            System.out.println("y: " + yjump);
                            if(i==1)
                            line.get(lcnt-1).setEff1(new Effect("Jump",startjump,xjump,yjump));
                            else if(i==2)
                            line.get(lcnt-1).setEff2(new Effect("Jump",startjump,xjump,yjump));
         }
                        else if(nxtLine.contains("Change")){
                            String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        startchange = Integer.parseInt(START2[1]); //start of circle hide
                        System.out.println("Start hide: " + startchange);
                        if(i==1)
                        line.get(lcnt-1).setEff1(new Effect("Hide",starthide));
                        else if(i==2)
                        line.get(lcnt-1).setEff2(new Effect("Hide",starthide));
                        }
                        }
                    }
                    try {
                        String empty5 = sc.nextLine();
                        if ((empty5.contains("")) && count != (ELEMENTS)) {
                            count += 1;
                        }

                    } catch (NoSuchElementException a) { //if it reads an extra line with nothing then it closes the file and breaks the loop
                        sc.close();
                        break;
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) { //if there is an error
            System.out.println("An error occurred.");

        }
        
    }

}
