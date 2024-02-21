package com.csc308.lab06.lab06;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class Screen {
    @FXML
    private AnchorPane screenPanel;

    private Repository repo;

    @FXML
    private void initialize(){
        repo = Repository.getInstance();
        BoxBuilder bb = new BoxBuilder(repo, screenPanel.getWidth(), screenPanel.getHeight());
        CircleBuilder cb = new CircleBuilder(repo, screenPanel.getWidth(), screenPanel.getHeight());
    }

}
