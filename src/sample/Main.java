package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //YEET
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hola como esta");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        System.out.print("YEEEEEEEEEEET");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
