// MPGCalculator.java
// Main application class that loads and displays the MPG Calculator's GUI.
//There is also a custom CSS file called application.css
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MilesPerGallonCalculator extends Application {
   @Override
   public void start(Stage stage) throws Exception {
      Parent root = 
         FXMLLoader.load(getClass().getResource("MilesPerGallonApp.fxml"));

      Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("MPG Calculator"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }

   public static void main(String[] args) {
      // create a MPGCalucaltor object and call its start method
      launch(args); 
   }
}
