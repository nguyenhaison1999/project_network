package sample.Main3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main extends Application {
    private double x, y;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

            FXMLLoader loader = new FXMLLoader(getClass().getResource("rootScreen.fxml"));
            AnchorPane rootStackPane = loader.load();
            Scene scene = new Scene(rootStackPane);
            primaryStage.setScene(scene);
            primaryStage.setHeight(425);
            primaryStage.setWidth(630);

            try{
                System.out.println("Success");
            }
            catch (Exception e){
                System.out.println("Failed!!!");
            }

            rootStackPane.setOnMousePressed(mouseEvent -> {
                x = mouseEvent.getSceneX();
                y = mouseEvent.getSceneY();
            });
            rootStackPane.setOnMouseDragged(mouseEvent -> {
                primaryStage.setX(mouseEvent.getScreenX() - x);
                primaryStage.setY(mouseEvent.getScreenY() - y);
            });

            primaryStage.show();
        }
}








