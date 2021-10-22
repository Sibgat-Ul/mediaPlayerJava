package com.musicPlayer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class MusicInterfaceController implements Initializable{

    @FXML
    private Pane pane;
    @FXML
    private Label songLabel;
    @FXML
    private Button playButton, pauseButton, nextButton, previousButton;
    @FXML
    private Slider volumeSlider;
    @FXML
    private ProgressBar progressBar;

    private Media media;
    private MediaPlayer mediaPlayer;

    private File directory;
    private File[] files;

    private ArrayList<File> songs;

    private int songNumber;

    private Timer timer;
    private TimerTask task;
    private boolean running;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        songs = new ArrayList<File>();
        directory = new File("music");
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file);
                System.out.println(file);
            }
        }

       media = new Media(songs.get(songNumber).toURI().toString());
       mediaPlayer = new MediaPlayer((media));

    }

    public void playMedia() {

    }

    public void pauseMedia() {

    }

    public void nextMedia() {

    }

    public void previousMedia() {

    }

    public void resetMedia() {

    }

    public void beginTimer() {

    }

    public void endTimer() {}

}
