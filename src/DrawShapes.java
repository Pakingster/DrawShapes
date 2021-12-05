/*
Maman 11 - Question 2 - "Draw 10 random shapes on canvas"
Student: Alexey Vartanov
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawShapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DrawShapes.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Draw Random Shapes - Alexey Vartanov");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
