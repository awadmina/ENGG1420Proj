

import com.sun.javafx.tk.Toolkit;
import java.sql.Time;
import java.util.Random;
import javax.swing.*;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;


//public class FXapplication extends JPanel {
//    
//Time t = new Timer(5, this);
//    
//    
//
//
//}
public class FXapplication extends Application {
public Rectangle[] rectt;
public Circle[] circle;
public Line[] line;
FileReader m = new FileReader();
//Player P = new Player();
Rectangle r;
Pane root;

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {
         root = new Pane();
        Timeline timer = new Timeline();
         // makes new filereader class//
        m.readfile("shapes.txt"); // reads file //
        

        ///Creating Java Rectangle Array
        System.out.println("The size of the arraylist of rectangle is: " + m.rectangle.size()); //sizes of the arraylist of rectangle
        rectt = new Rectangle[m.rectangle.size()]; //creates an array of java.rect whiich
        for (int i = 0; i < m.rectangle.size(); i++) { //creating the rectangles in the java rectangle
            rectt[i] = new Rectangle(m.rectangle.get(i).x, m.rectangle.get(i).y, m.rectangle.get(i).width, m.rectangle.get(i).length);
            //System.out.println("Values of rectangle " + i + "in the java rectangle array: X" + m.rectangle.get(i).x + " Y" + m.rectangle.get(i).y + " width" + m.rectangle.get(i).width + " length" + m.rectangle.get(i).length);
            rectt[i].setStroke(Color.BLACK);
            rectt[i].setStrokeWidth(2);
            }

        //Creating Java Circle Array
       System.out.println("The size of the arraylist of rectangle is: " + m.rectangle.size());
       circle = new Circle[m.circle.size()];
        for (int i = 0; i < m.circle.size(); i++) { //creating the rectangles in the java rectangle
            circle[i] = new Circle(m.circle.get(i).x, m.circle.get(i).y, m.circle.get(i).r);
            circle[i].setFill(Color.rgb(m.circle.get(i).getRed(),m.circle.get(i).getGreen(),m.circle.get(i).getBlue()));
            circle[i].setStroke(Color.BLACK);
            circle[i].setStrokeWidth(m.circle.get(i).borderthickness);
        }

        //Creating Java Line Array
        System.out.println("The size of the arraylist of rectangle is: " + m.line.size());
        line = new Line[m.line.size()];
        for (int i = 0; i < m.line.size(); i++){
            line[i] = new Line(m.line.get(i).startX, m.line.get(i).startY, m.line.get(i).endX, m.line.get(i).endY);
             line[i].setFill(Color.rgb(232,63,45));
             line[i].setStrokeWidth(5);
        }

        r = new Rectangle(40, 200, 60, 60);
        r.setFill(Color.LIGHTSALMON);

        

//       timer.setCycleCount(4); //number of cycles
//       timer.setAutoReverse(true);
//            KeyValue kv = new KeyValue(rectt[0].translateXProperty(), 200);
//            KeyValue kh = new KeyValue(rectt[0].translateYProperty(), -40);
//           KeyFrame kfx = new KeyFrame(Duration.millis(1000), kv);
//            KeyFrame kfy = new KeyFrame(Duration.millis(1000), kh);
//           timer.getKeyFrames().addAll(kfx, kfy);
       //root.getChildren().add(rectt[0]);
       //root.getChildren().add(r);
           
//            timer.play();
            
       MyTimer t = new MyTimer();
       t.start();

        

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Animation");
        stage.setScene(scene);
        stage.show();
    }

    private class MyTimer extends AnimationTimer {
               Random r=new Random();
        int frame =0; // Current frame
        int frames = m.f; // Max frames
        int FPS = m.FPS;// FPS

        public void handle(long now){
            frame++;
            
            System.out.println("frame number: "+frame);
            for(int i=0;i<m.rcnt;i++){
            if(frame == m.rectangle.get(i).eff1.start){
                root.getChildren().add(rectt[i]); 
            }
            if(frame == m.rectangle.get(i).eff2.start){
    rectt[i].setX(rectt[i].getX()+m.rectangle.get(i).eff2.getxJump());
    rectt[i].setY(rectt[i].getY()+m.rectangle.get(i).eff2.getyJump());
            };
            }
            
            for(int i=0;i<m.ccnt;i++){
                        if(frame == m.circle.get(i).eff1.start){
                root.getChildren().add(circle[i]); 
            }
            if(frame ==m.circle.get(i).eff2.start){
                root.getChildren().remove(circle[i]); 
            };
            }
            for(int i=0;i<m.lcnt;i++){
                if(frame==1){
                 root.getChildren().add(line[i]);
                }
                if(frame == m.line.get(i).eff1.start){
                line[i].setStroke(Color.rgb(r.nextInt(255),r.nextInt(255),r.nextInt(255))); 
            }
            if(frame ==m.circle.get(0).eff2.start){
    line[i].setStartX(line[i].getStartX()+m.line.get(i).eff2.getxJump());
   line[i].setStartY(line[i].getStartY()+m.line.get(i).eff2.getyJump());
       line[i].setEndX(line[i].getEndX()+m.line.get(i).eff2.getxJump());
   line[i].setEndY(line[i].getEndY()+m.line.get(i).eff2.getyJump());
            };
            }
            for(int i=0;i<m.rcnt;i++){
            if(frame== m.rectangle.get(i).eff2.start+r.nextInt(100)){
            rectt[i].setFill(Color.rgb(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
            }
            }
         
            
            if(frame > frames) {
                stop();
                System.exit(0);
            }
            try {
                Thread.sleep(1000/ FPS);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
