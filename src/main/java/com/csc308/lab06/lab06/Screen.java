package com.csc308.lab06.lab06;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.beans.PropertyChangeListener;

public class Screen extends Application implements PropertyChangeListener{
    @FXML
    private AnchorPane screenPanel;

    private static final double PANEL_WIDTH = 700;
    private static final double PANEL_HEIGHT = 700;

    @FXML
    private void initialize(){
        BoxBuilder boxBuilder = new BoxBuilder(PANEL_WIDTH, PANEL_HEIGHT);
        CircleBuilder circleBuilder = new CircleBuilder(PANEL_WIDTH, PANEL_HEIGHT);

        Repository.getInstance().addPropertyChangeListener(this);

        try{
            ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
            executor.scheduleAtFixedRate(circleBuilder, 0, 1000, TimeUnit.MILLISECONDS);
            executor.scheduleAtFixedRate(boxBuilder, 500, 1000, TimeUnit.MILLISECONDS);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void stop(){
        //kills all threads when window is closed
        System.exit(0);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt){
        Platform.runLater(() ->{

                screenPanel.getChildren().add((Node)evt.getNewValue());});
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Screen.class.getResource("screen-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), PANEL_WIDTH, PANEL_HEIGHT);
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
