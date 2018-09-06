package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("All bow down for...");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        System.out.print("Galen, king of memes");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
