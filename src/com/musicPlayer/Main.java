package com.musicPlayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
	// write your code here
        FXMLLoader root = new FXMLLoader(getClass().getResource("MusicInterface.fxml"));
        Scene scene = new Scene(root.load());

        scene.setFill(Color.TRANSPARENT);
        scene.getStylesheets().add("./MusicPlayer.css");

        Image icon = new Image("com/musicPlayer/icon.png");
        stage.getIcons().add(icon);

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.setTitle("Mini Music");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
