
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 */
 
public class Rect_our extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }
 
    @Override
    public void start(Stage stage)
    {
        // Create the Rectangles
        Rectangle rectangle = new Rectangle(100, 50, Color.LIGHTGRAY);
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);
        // Create the Pane
        Pane root = new Pane();
        // Add the Children to the Pane
        root.getChildren().addAll(rectangle);
 
        // Create the Scene
        Scene scene = new Scene(root);
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("A JavaFX Rectangle Example");
        // Display the Stage
        stage.show();
    }


}
