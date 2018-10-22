package sample;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Snake Grid");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        Rectangle grid = new Rectangle();
        grid.setX(50);
        grid.setY(50);
        grid.setHeight(100);
        grid.setWidth(200);

        root.getChildren().add(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
